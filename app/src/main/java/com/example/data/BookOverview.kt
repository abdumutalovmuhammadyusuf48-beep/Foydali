package com.example.data

import com.example.model.Chapter

object BookOverview {
  const val BOOK_NAME_ARABIC = "مختصر الوقاية في مسائل الهداية"
  const val BOOK_NAME_UZBEK = "Muxtasarul Viqoya fi Masoilih Hidoya"
  const val AUTHOR_FULL = "Al-Alloma Sadrush Shari'a Ubaydulloh ibn Mas'ud ibn Tojush Shari'a al-Mahbubiy al-Buxoriy"
  const val AUTHOR_DEATH = "Hijriy 747-yil (Milodiy 1346-yil)"
  const val MADHHAB = "Hanafiy mazhabi"

  const val ABOUT_SUMMARY = """
«Muxtasarul Viqoya» (مختصر الوقاية في مسائل الهداية) — butun islom olamida, xususan Movarounnahr (Buxoro, Samarqand, Xorazm, Toshkent, Farg'ona) madrasalarida asrlar mobaynida Hanafiy fiqhining eng asosiy va mo'tabar darsligi bo'lib kelgan shoh asardir.

Asarning kelib chiqish tarixi:
Buyuk faqih Burhoniddin Marg'inoniy (rahimahulloh) o'zining «Al-Hidoya» kitobini yozgach, ushbu asar fiqh ilmining cho'qqisi sifatida tan olingan. Sadrush Shari'aning bobosi Mahmud ibn Sadrush Shari'a (Tojush Shari'a) nabirasi Ubaydulloh yoshligida «Hidoya» masalalarini oson yodlab, o'rganishi uchun «Viqoyatur rivoya fi masoilih Hidoya» kitobini tuzgan.

Keyinchalik alloma Sadrush Shari'a Ubaydulloh ibn Mas'ud (rahimahulloh) ushbu kitobni yanada pishiq, ixcham va tolibi ilmlar uchun yod olishga qulay qilib qisqartirdi va unga «Muxtasarul Viqoya» deb nom berdi. Shuningdek, o'zi unga mashhur «Sharhul Viqoya» asarini ham yozdi.

Mazkur kitob tahorat, namoz, zakot, ro'za, haj, nikoh, taloq, qasamlar, savdo-sotiq, sudxo'rlik (ribo), sherikchilik, ijara, hadya, qasos, diyat, qozilik va boshqa hayotiy fiqhiy masalalarni eng nozik va daqiq tafsilotlarigacha qamrab olgan.
"""

  val chapters = listOf(
    Chapter(
      id = "tahorat",
      arabicTitle = "كتاب الطهارة",
      uzbekTitle = "Tahorat kitobi",
      description = "Tahorat farzlari, sunnatlari, buzuvchilari, g'usl, suvlar, quduqlar, su'r, tayammum, mahsiga mash, hayz va najosatlar",
      questionCount = 30
    ),
    Chapter(
      id = "namoz_1",
      arabicTitle = "كتاب الصلوة (١)",
      uzbekTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
      description = "Namoz vaqtlari, azon, iqomat, namozning shartlari, farzlari, vojiblari, sunnatlari va qiroat",
      questionCount = 30
    ),
    Chapter(
      id = "namoz_2",
      arabicTitle = "كتاب الصلوة (٢)",
      uzbekTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
      description = "Imomat, namozni buzuvchi amallar, vitr, sunnatlar, taroveh, qazo, sajdai sahv, tilovat sajdasi, bemor va musofir namozi",
      questionCount = 25
    ),
    Chapter(
      id = "namoz_3",
      arabicTitle = "كتاب الصلوة (٣)",
      uzbekTitle = "Namoz: Juma, Hayit va Janoza",
      description = "Juma namozi, Hayit namozlari, takbiri tashriq, kusuf, xavf namozi, janoza, kafanlash, dafn va shahid hukmlari",
      questionCount = 25
    ),
    Chapter(
      id = "zakot",
      arabicTitle = "كتاب الزكوة",
      uzbekTitle = "Zakot kitobi",
      description = "Zakot shartlari, tuya, qoramol, qo'y nisobi, oltin-kumush, tijorat moli, ushur, xiroj, ma'danlar, zakot sarflanadigan o'rinlar va fitr",
      questionCount = 25
    ),
    Chapter(
      id = "roza",
      arabicTitle = "كتاب الصوم",
      uzbekTitle = "Ro'za kitobi",
      description = "Ro'za turlari, niyat, hilol ko'rish, qazo va kafforat vojib qiluvchi holatlar, makruh amallar, fidya va e'tikof",
      questionCount = 25
    ),
    Chapter(
      id = "haj",
      arabicTitle = "كتاب الحج",
      uzbekTitle = "Haj kitobi",
      description = "Haj shartlari, miqotlar, ehrom, tavof, sa'y, Arofat, Muzdalifa, tosh otish, qurbonlik, qiron, tamattu, ifrod va jinoyatlar",
      questionCount = 25
    ),
    Chapter(
      id = "nikoh",
      arabicTitle = "كتاب النكاح والرضاع",
      uzbekTitle = "Nikoh va Emizish kitobi",
      description = "Ijob-qabul, guvohlar, harom qilingan ayollar, tenglik (kufu'), mahr, valiy, emizish (rizo') muddati va hukmlari",
      questionCount = 25
    ),
    Chapter(
      id = "taloq",
      arabicTitle = "كتاب الطلاق",
      uzbekTitle = "Taloq, Idda va Nafaqa kitobi",
      description = "Sunniy va bid'iy taloq, sarih va kinoya, tafviz, ta'liq, raj'at, ilo', xul', zihor, li'on, innin, idda, hidona va nafaqa",
      questionCount = 25
    ),
    Chapter(
      id = "aymon",
      arabicTitle = "كتاب الايمان والعتاق",
      uzbekTitle = "Qasamlar va Ozod qilish kitobi",
      description = "G'amus, lag'v, mun'aqida qasamlari, kafforat, turli fe'llardagi qasamlar, qul ozod qilish va kitobat",
      questionCount = 25
    ),
    Chapter(
      id = "buyu",
      arabicTitle = "كتاب البيوع والربا",
      uzbekTitle = "Savdo-sotiq va Ribo kitobi",
      description = "Savdo ruknlari, shartlari, xiyorlar, fosid va botil bay', iqola, murobaha, ribo (sudxo'rlik) qoidalari, salam va sarf",
      questionCount = 25
    ),
    Chapter(
      id = "muomala",
      arabicTitle = "كتاب المعاملات",
      uzbekTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
      description = "Shuf'a, taqsimot, hadya, ijara, rahn, kafolat, havola, vakolat, shirkat, muzoraba va vaqf",
      questionCount = 25
    ),
    Chapter(
      id = "jinoyat_hudud",
      arabicTitle = "كتاب الجنايات والحدود والقضاء",
      uzbekTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
      description = "Qasos, diyat, o'g'irlik, zino, mastlik haddi, qozilik, guvohlik, karohiyat, zaboyih, ov, qurbonlik va vasiyatlar",
      questionCount = 25
    )
  )
}
