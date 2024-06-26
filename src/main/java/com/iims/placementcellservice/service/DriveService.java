package com.iims.placementcellservice.service;

import com.iims.placementcellservice.entity.Drive;
import com.iims.placementcellservice.model.CompanyDriveDto;
import com.iims.placementcellservice.model.DriveDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DriveService {
    ResponseEntity<DriveDto> createDriveDetails(DriveDto driveDto);
    ResponseEntity<List<Drive>> getAllDrives();
    ResponseEntity<String> updateDriveDetails(DriveDto driveDto);

    ResponseEntity<List<CompanyDriveDto>> getAllDrives(String username);

    ResponseEntity<List<CompanyDriveDto>> getAllDrivesWithCompany();


}
