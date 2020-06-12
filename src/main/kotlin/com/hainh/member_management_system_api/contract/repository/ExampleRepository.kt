package com.hainh.member_management_system_api.contract.repository

import com.hainh.member_management_system_api.model.Example
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface ExampleRepository : JpaRepository<Example, Long>
