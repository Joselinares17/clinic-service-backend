package org.clinic.sanitary.application.service;

import org.clinic.sanitary.infrastructure.model.request.RegisterDoctorRequest;
import org.clinic.sanitary.infrastructure.model.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDoctorService {
    UserResponse createDoctor(RegisterDoctorRequest request);
    Page<UserResponse> getAllDoctors(Pageable pageable);
    UserResponse getDoctorById(Long id);
    boolean existsDoctorById(Long id);
    boolean deleteDoctorById(Long id);
}
