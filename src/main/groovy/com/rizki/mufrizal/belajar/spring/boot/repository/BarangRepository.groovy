package com.rizki.mufrizal.belajar.spring.boot.repository

import com.rizki.mufrizal.belajar.spring.boot.domain.Barang
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.Description
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.com>
 * @Since 12 January 2017
 * @Time 10:23 PM
 * @Project Belajar-Spring-Boot
 * @Package com.rizki.mufrizal.belajar.spring.boot.repository
 * @File BarangRepository
 *
 */
@RepositoryRestResource(collectionResourceRel = "barang", path = "barang", collectionResourceDescription = @Description("API Barang"))
interface BarangRepository extends MongoRepository<Barang, String> {

}