package org.re.mdtlog.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MdtLogRepository extends JpaRepository<MdtLog, UUID> {

}
