package com.rizki.mufrizal.belajar.spring.boot.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.com>
 * @Since 12 January 2017
 * @Time 10:13 PM
 * @Project Belajar-Spring-Boot
 * @Package com.rizki.mufrizal.belajar.spring.boot.domain
 * @File Barang
 *
 */
@Document(collection = "tb_barang")
class Barang implements Serializable {

    @Id
    @Field(value = "id_barang")
    String idBarang

    @Field(value = "nama_barang")
    String namaBarang

    @Field(value = "jenis_barang")
    JenisBarang jenisBarang

    @Field(value = "tanggal_kadaluarsa")
    Date tanggalKadaluarsa

    @Field(value = "harga_satuan_barang")
    BigDecimal hargaSatuanBarang

    @Field(value = "jumlah_barang_tersedia")
    Integer jumlahBarangTersedia

}
