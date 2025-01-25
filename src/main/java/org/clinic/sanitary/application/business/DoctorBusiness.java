package org.clinic.sanitary.application.business;

import org.clinic.sanitary.application.service.IDoctorService;
import org.clinic.sanitary.domain.repository.UserRepository;
import org.clinic.sanitary.infrastructure.model.request.RegisterDoctorRequest;
import org.clinic.sanitary.infrastructure.model.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DoctorBusiness implements IDoctorService {
    private final UserRepository userRepository;

    public DoctorBusiness(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse createDoctor(RegisterDoctorRequest request) {
        return null;
    }

    @Override
    public Page<UserResponse> getAllDoctors(Pageable pageable) {
        return null;
    }

    @Override
    public UserResponse getDoctorById(Long id) {
        return null;
    }

    @Override
    public boolean existsDoctorById(Long id) {
        return false;
    }

    @Override
    public boolean deleteDoctorById(Long id) {
        return false;
    }
}
