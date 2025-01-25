package org.clinic.sanitary.infrastructure.model.response;

import lombok.Builder;
import org.clinic.sanitary.infrastructure.model.dto.UserInfoDTO;

@Builder
public record UserResponse(
        UserInfoDTO userInfo
) {
}
