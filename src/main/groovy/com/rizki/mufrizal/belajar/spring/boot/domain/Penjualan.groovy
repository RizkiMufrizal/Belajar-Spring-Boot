package com.rizki.mufrizal.belajar.spring.boot.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.com>
 * @Since 12 January 2017
 * @Time 10:17 PM
 * @Project Belajar-Spring-Boot
 * @Package com.rizki.mufrizal.belajar.spring.boot.domain
 * @File Penjualan
 *
 */
@Document(collection = "tb_penjualan")
class Penjualan implements Serializable {

    @Id
    @Field(value = "id_penjualan")
    String idPenjualan

    @Field(value = "tanggal_transaksi")
    Date tanggalTransaksi

    @Field(value = "nama_pembeli")
    String namaPembeli

    @Field(value = "total_harga")
    BigDecimal totalHarga

}
