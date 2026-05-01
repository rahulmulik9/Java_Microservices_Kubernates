package com.rahul.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
/*In base entity we have added annotation as
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String updatedBy;
    For this spring will know whom are responsible
    */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }

}