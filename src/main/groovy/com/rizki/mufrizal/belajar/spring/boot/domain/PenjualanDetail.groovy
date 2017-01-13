package com.rizki.mufrizal.belajar.spring.boot.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.com>
 * @Since 12 January 2017
 * @Time 10:20 PM
 * @Project Belajar-Spring-Boot
 * @Package com.rizki.mufrizal.belajar.spring.boot.domain
 * @File PenjualanDetail
 *
 */
@Document(collection = "tb_penjualan_detail")
class PenjualanDetail implements Serializable {

    @Id
    @Field(value = "id_penjualan_detail")
    String idPenjualanDetail

    @Field(value = "jumlah_barang")
    Integer jumlahBarang

    @Field(value = "total_harga_per_barang")
    BigDecimal totalHargaPerBarang

    @DBRef(lazy = true)
    Penjualan penjualan

    @DBRef(lazy = true)
    Barang barang

}
