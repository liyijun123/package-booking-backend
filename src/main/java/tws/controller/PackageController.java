package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Package;
import tws.service.PackageService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/packages")
public class PackageController {
    @Autowired
    private PackageService packageService;
    @GetMapping()
    private ResponseEntity<List<Package>> getPackageList() {
        return ResponseEntity.ok(packageService.select());
    }
    @PostMapping()
    private ResponseEntity<String> addPackage(@Valid Package packageItem) {
        try {
            packageService.insert(packageItem);
        }catch (Exception e) {
            return ResponseEntity.ok("创建失败");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("创建成功");
    }
}
