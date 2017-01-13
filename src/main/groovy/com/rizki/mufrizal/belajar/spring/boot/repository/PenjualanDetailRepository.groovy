package com.rizki.mufrizal.belajar.spring.boot.repository

import com.rizki.mufrizal.belajar.spring.boot.domain.PenjualanDetail
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.Description
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.com>
 * @Since 12 January 2017
 * @Time 10:26 PM
 * @Project Belajar-Spring-Boot
 * @Package com.rizki.mufrizal.belajar.spring.boot.repository
 * @File PenjualanDetailRepository
 *
 */
@RepositoryRestResource(collectionResourceRel = "penjualan_detail", path = "penjualan_detail", collectionResourceDescription = @Description("API Penjualan detail"))
interface PenjualanDetailRepository extends MongoRepository<PenjualanDetail, String> {

}