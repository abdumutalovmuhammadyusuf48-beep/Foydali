package com.example.data

import com.example.model.Question
import com.example.model.QuestionDifficulty

val questionsPart1: List<Question> = listOf(
  // TAHORAT (1 - 30)
  Question(
    id = 1,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "«Muxtasarul Viqoya»da tahoratning farzlari nechta deb bayon qilingan va ular qaysilar?",
    options = listOf(
      "3 ta: yuzni yuvish, qo'llarni yuvish va oyoqlarni yuvish",
      "4 ta: yuzni yuvish, qo'llarni tirsaklar bilan yuvish, boshning to'rtdan biriga mash tortish, oyoqlarni to'piqlar bilan yuvish",
      "5 ta: niyat qilish, yuzni yuvish, qo'llarni yuvish, boshga mash va oyoqlarni yuvish",
      "6 ta: niyat, yuz, qo'llar, bosh, oyoqlar va tartib"
    ),
    correctIndex = 1,
    explanation = "Muxtasarul Viqoyaning iborasi: «فرض الوضوء غسل الوجه... ويديه مع مرفقيه ومسح ربع رأسه ورجليه مع كعبيه». Ya'ni tahorat farzi to'rttadir: yuzni yuvish, qo'llarni tirsaklari bilan, boshning to'rtdan biriga mash tortish va oyoqlarni to'piqlari bilan yuvish.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 2,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Tahoratda yuzning chegarasi qayerdan qayergacha hisoblanadi?",
    options = listOf(
      "Peshonadan bo'yingacha va quloqlarning orqasigacha",
      "Soch o'sadigan odatiy chegaradan iyak ostigacha va bir quloq yumshog'idan ikkinchi quloq yumshog'igacha",
      "Faqat ko'zlar, burun va og'iz atrofidagi joy",
      "Boshning eng yuqori nuqtasidan bo'g'izgacha"
    ),
    correctIndex = 1,
    explanation = "Matnda: «من الشعر الى اسفل الذقن والى الاذنين». Soch o'rnidan to iyak ostigacha, eniga esa ikki quloqqacha bo'lgan oraliqni yuvish farzdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 3,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Qalin soqolli kishi tahorat olayotganda nima qilishi vojib/farz?",
    options = listOf(
      "Soqolini butunlay tagidan qirib yuvish",
      "Teri ko'rinmaydigan darajada bo'lsa, ustki qismiga suv yetkazish farzdir",
      "Soqolga faqat mash tortish kifoya, yuvilmaydi",
      "Soqolini yechib har bir tolasini alohida yuvish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وكل ما يستر البشرة من اللحية». Soqoldan yuz terisini to'sib turgan tashqi qismini yuvish kifoya qiladi, uning tagiga suv yetkazish farz emas, balki hilol qilish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 4,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Boshga mash tortishda farz bo'lgan eng kam miqdor qancha?",
    options = listOf(
      "Boshning hammasiga tortish",
      "Boshning uchdan biriga tortish",
      "Boshning to'rtdan bir qismiga (rub'i ra's)",
      "Bir barmoq tekkizish kifoya"
    ),
    correctIndex = 2,
    explanation = "Matnda: «ومسح ربع رأسه». Boshning to'rtdan bir qismiga mash tortish farzdir, qolgan qismiga esa sunnat hisoblanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 5,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quloqlarga mash tortish haqida Hanafiy mazhabida qanday hukm keltirilgan?",
    options = listOf(
      "Quloqlar uchun har doim mutlaqo yangi suv olinishi shart",
      "Quloqlar boshning suvi bilan mash qilinadi",
      "Quloqlar yuviladi, mash tortilmaydi",
      "Quloqlarga mash tortish makruh"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومسح كل الرأس مرة والاذنين بمائه». Ya'ni boshning barchasiga bir bor mash tortish va ikki quloqqa ham o'sha boshning suvi bilan mash tortish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 6,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quyidagilardan qaysi biri tahoratni sindirmaydi?",
    options = listOf(
      "Badandan qon chiqib, o'z o'rnidan oqishi",
      "Og'iz to'lib qayt qilish",
      "O'tirgan holda suyanmasdan uxlab qolish",
      "Namozda ruku' va sajdasi bor holda balog'atga yetgan kishining qahqaha otishi"
    ),
    correctIndex = 2,
    explanation = "Matnda uyqu haqida: «ونوم متكئ الى ما لوزيل لسقط». Suyangan narsasi olib tashlansa yiqilib tushadigan darajada suyanib uxlash tahoratni sindiradi. Ammo yerga o'tirib, suyanmasdan uxlash tahoratni buzmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-4-bet"
  ),
  Question(
    id = 7,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Burundan yoki yaradan chiqqan qon qachon tahoratni sindiradi?",
    options = listOf(
      "Har qanday holatda, hatto igna uchidek chiqib oqmasa ham",
      "Chiqqan joyidan pok joyga oqib o'tsa",
      "Faqat bir piyola miqdorida to'plansa",
      "Faqat kiyimga tegsa"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ان كان نجسا سال الى ما يطهر». Chiqqan najas a'zoning poklanishi lozim bo'lgan joyiga oqib o'tsa tahorat buziladi, agar oqmay o'z o'rnida qolsa buzilmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 8,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Qayt qilish qachon tahoratni sindiradi?",
    options = listOf(
      "Har qanday miqdorda qayt qilsa",
      "Agar og'izni to'ldiradigan darajada (mil'ul-fam) bo'lsa",
      "Faqat taom emas, balki balg'am bo'lsa",
      "Faqat ertalab qayt qilsa"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ان ملأ الفم لا بلغما اصلا». Agar og'izni to'ldirsa tahoratni sindiradi. Balg'am esa qancha ko'p bo'lsa ham tahoratni sindirmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 4-bet"
  ),
  Question(
    id = 9,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "G'uslning farzlari nechta?",
    options = listOf(
      "2 ta: niyat va butun badanni yuvish",
      "3 ta: og'izni chayqash, burunni chayqash va butun badanni bir marta to'liq yuvish",
      "4 ta: tahorat olish, og'iz, burun va badanni yuvish",
      "5 ta: boshdan oyoqqacha 3 marta suv quyish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفرض الغسل غسل فمه وانفه وكل البدن». Ya'ni g'uslning farzi: og'izni yuvish (madmada), burunni yuvish (istinshoq) va butun badanni yuvishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 4-bet"
  ),
  Question(
    id = 10,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Sochi o'rilgan ayol kishi g'usl qilganda sochini yoyishi shartmi?",
    options = listOf(
      "Ha, har doim har bir tolasini yoyish farz",
      "Yo'q, agar soch tagiga suv yetsa, o'ramni yechish shart emas",
      "Faqat hayzdan keyin yoyadi, junublikda yoymaydi",
      "Ayol kishiga boshiga umuman suv tekkizmaslikka ruxsat bor"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويكفى لذات الضفيرة ان ابتل اصلها». Sochlari o'rilgan ayol uchun sochning tagiga suv yetishi kifoyadir, o'rimni yozish shart emas.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 4-bet"
  ),
  Question(
    id = 11,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quyidagi holatlardan qaysi birida g'usl qilish sunnat hisoblanadi?",
    options = listOf(
      "Juma, ikki hayit, ehrom bog'lash va Arafa kuni (Arofatda turish uchun)",
      "Faqat har juma kuni",
      "Har namoz oldidan",
      "Faqat Ramazon oyida"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وسن للجمعة والعيدين والاحرام وعرفة». Juma, ikki hayit, haj ehromi va Arafa kuni uchun g'usl qilish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 4-bet"
  ),
  Question(
    id = 12,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Oqar suvga (moyi joriy) najosat tushsa, uning hukmi nima bo'ladi?",
    options = listOf(
      "Suv bir tomchi najosat bilan ham harom bo'ladi",
      "Najosat asari (rangi, ta'mi yoki hidi) ko'rinmaguncha u najas bo'lmaydi",
      "Faqat 10 kundan keyin poklanadi",
      "Oqar suvga najosat tushsa doim najas hisoblanadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «لا ينجس الا اذا تغير طعمه او لونه او ريحه وان لم يكن ينجس». Oqar suv najosatning rangi, ta'mi yoki hidi zohir bo'lmaguncha najas bo'lmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 4-5-bet"
  ),
  Question(
    id = 13,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quduqqa sichqon, chumchuq kabi kichik jonivor tushib o'lsa, quduqdan qancha suv chiqariladi?",
    options = listOf(
      "5 paqir",
      "20 tadan 30 tagacha paqir",
      "40 tadan 60 tagacha paqir",
      "Quduqning hamma suvi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي نحو عصفور نصف ذلك دلوا وسطا». Qush, sichqon kabi kichik jonivor tushib o'lsa 20-30 paqir chiqariladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 5-bet"
  ),
  Question(
    id = 14,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quduqqa tovuq, mushuk tushib o'lsa, qancha suv chiqariladi?",
    options = listOf(
      "10-20 paqir",
      "40 tadan 60 tagacha paqir",
      "100 paqir",
      "Faqat 1 paqir"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي نحو دجاجة اربعون الى ستين». Tovuq, mushuk kabi o'rta kattalikdagi hayvon o'lsa 40 dan 60 paqirgacha suv chiqariladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 5-bet"
  ),
  Question(
    id = 15,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quduqqa odam, qo'y tushib o'lsa yoki har qanday hayvon shishib (intifaxa) yorilib ketsa, qancha suv chiqariladi?",
    options = listOf(
      "50 paqir",
      "80 paqir",
      "Quduqning barcha suvi (kullu maiha)",
      "Hech qancha, o'zi tozalanadi"
    ),
    correctIndex = 2,
    explanation = "Matnda: «ينزح كل مائها ان امكن والافقدر ما فيها بقول ذوي بصارة... حيوان انتفخ او تفسخ او مات مثل ادمي او شاة». Agar odam yoki qo'y o'lsa, yoki har qanday hayvon shishib, aynib ketsa, quduqning butun suvi chiqariladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 5-bet"
  ),
  Question(
    id = 16,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Mushuk ichgan idishdagi suvning (su'r) hukmi qanday?",
    options = listOf(
      "Mutlaqo najas, ishlatish harom",
      "Makruh (boshqa suv bo'lsa ishlatilmaydi, bo'lmasa tahorat joiz)",
      "Har doim sof pok, xuddi odamdek",
      "Faqat it ichgandek najas"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وسؤر الهرة والدجاجة المخلاة وسباع الطير وسواكن البيوت مكروه». Mushuk, qo'yib yuborilgan tovuq, yirtqich qushlar va uyda yashovchi mayda jonivorlar suvi makruhdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 5-6-bet"
  ),
  Question(
    id = 17,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Eshak va xachir ichgan suvning (su'r) fiqhiy hukmi nima?",
    options = listOf(
      "Pok, hech qanday shubha yo'q",
      "Najas, mutlaqo ishlatilmaydi",
      "Shubhali (mashkuk) — boshqa suv topilmasa u bilan tahorat qilinadi va tayammum ham qo'shib qilinadi",
      "Faqat kiyim yuvishga yaraydi"
    ),
    correctIndex = 2,
    explanation = "Matnda: «والحمار والبغل مشكوك فيه ويتوضأ به ويتيمم». Eshak va xachir so'lagi shubhalidir. U bilan tahorat qilinadi va tayammum ham qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 6-bet"
  ),
  Question(
    id = 18,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Suvdan qancha masofada uzoqda bo'lganda tayammum qilishga ruxsat beriladi?",
    options = listOf(
      "100 metr",
      "Bir mil (taxminan 1.8-2 km) yoki undan ortiq uzoqlikda bo'lganda",
      "Faqat 3 kunlik yo'l masofasida",
      "Faqat qish faslida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يخلف الوضوء والغسل عند العجز عن الماء لبعده ميلا او لمرض...». Suvdan bir mil uzoqlikda bo'lganda yoki kasallik, sovuq xavfi bo'lganda tayammum qilish joizdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 6-bet"
  ),
  Question(
    id = 19,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Tayammum qilishda yer jinsiga necha marta uriladi?",
    options = listOf(
      "1 marta: faqat yuz uchun",
      "2 marta: birinchisi yuzga mash tortish, ikkinchisi ikki qo'lga tirsaklarigacha mash tortish uchun",
      "3 marta: yuz, qo'l va bosh uchun",
      "4 marta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وهو ضربة لمسح وجهه وضربة ليديه مع مرفقيه على كل طاهر من جنس الارض». Pok yer jinsiga ikki zarb uriladi: biri yuzga, biri tirsaklarigacha qo'llarga mash qilish uchun.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 6-bet"
  ),
  Question(
    id = 20,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Bitta tayammum bilan nechta namoz o'qish mumkin?",
    options = listOf(
      "Faqat 1 ta farz namoz",
      "Faqat 1 ta farz va 2 rakat nafl",
      "Tahoratni sindiruvchi holat yoki suv topilguncha xohlaganicha farz va nafl namozlarini o'qish mumkin",
      "Faqat vaqt chiqquncha"
    ),
    correctIndex = 2,
    explanation = "Matnda: «ويصلي بواحد ما شاء». Bir tayammum bilan xohlaganicha farz va nafl namozlarini o'qishi joizdir (Hanafiy mazhabida tahorat kabidir).",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 6-bet"
  ),
  Question(
    id = 21,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Mahsiga mash tortish muddati muqim va musofir uchun qancha?",
    options = listOf(
      "Muqimga 1 kun, musofirga 2 kun",
      "Muqimga 1 kecha-kunduz (24 soat), musofirga 3 kecha-kunduz (72 soat)",
      "Muqimga 3 kun, musofirga 7 kun",
      "Ikkalasiga ham birdek 12 soat"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومدته للمقيم يوم وليلة وللمسافر ثلاثة من وقت الحدث». Mash muddati muqim uchun bir kecha-kunduz, musofir uchun uch kecha-kunduzdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 7-bet"
  ),
  Question(
    id = 22,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Mahsiga mash tortish muddati qaysi paytdan boshlab hisoblanadi?",
    options = listOf(
      "Mahsini kiygan vaqtdan boshlab",
      "Mahsini kiygandan so'ng birinchi marta tahorati ketgan (hadas bo'lgan) vaqtdan boshlab",
      "Birinchi namoz o'qigan vaqtdan",
      "Tong otgan vaqtdan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «من وقت الحدث». Ya'ni tahorat bilan mahsi kiyib, keyin tahorati singan paytdan boshlab muddat hisoblanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 7-bet"
  ),
  Question(
    id = 23,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Mahsining yirtig'i qanchalik bo'lsa, unga mash tortish joiz bo'lmaydi?",
    options = listOf(
      "Igna teshigidek bo'lsa ham",
      "Oyoqning eng kichik uch barmog'i miqdorida ochilib tursa",
      "Butun tovon ochilsa",
      "Faqat tag qismi yirtilsa"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويمنعه خرق يبدو منه قدر ثلاث اصابع الرجل اصغرها». Oyoqning eng kichik uchta barmog'i miqdoricha yirtiq bo'lsa mash joiz bo'lmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 7-bet"
  ),
  Question(
    id = 24,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Hanafiy mazhabida hayzning eng oz va eng ko'p muddati qancha?",
    options = listOf(
      "Eng ozi 1 kun, eng ko'pi 7 kun",
      "Eng ozi 3 kun (kecha-kunduz), eng ko'pi 10 kun",
      "Eng ozi 2 kun, eng ko'pi 15 kun",
      "Eng ozi 5 kun, eng ko'pi 12 kun"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واقله ثلاثة ايام ولياليها واكثره عشرة». Hayzning eng ozi uch kun va kechalari, eng ko'pi esa o'n kundir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 7-bet"
  ),
  Question(
    id = 25,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Ikki hayz orasidagi eng oz poklik (tuhr) muddati necha kun?",
    options = listOf(
      "7 kun",
      "10 kun",
      "15 kun",
      "30 kun"
    ),
    correctIndex = 2,
    explanation = "Matnda: «واقل الطهر المتخلل بين الدمين في مدته وما رأت من لون فيها سوى البياض حيض... واقل الطهر خمسة عشر يوما». Ikki qon orasidagi eng kam poklik muddati o'n besh kundir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 7-bet"
  ),
  Question(
    id = 26,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Nifasning (tuqqandan keyingi qon) eng ko'p muddati qancha?",
    options = listOf(
      "30 kun",
      "40 kun (aksaaruhu arba'un yavman)",
      "60 kun",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والنفاس دم يعقب الولد لا حد لاقله واكثره اربعون يوما». Nifasning eng oziga chegara yo'q, eng ko'pi qirq kundir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 8-bet"
  ),
  Question(
    id = 27,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Uzrli kishi (mustahaza, peshob to'xtamaydigan kishi) qachon tahorat oladi?",
    options = listOf(
      "Har bir namoz vaqti kirganda bir marta tahorat oladi",
      "Faqat ertalab bir marta",
      "Har rakatda alohida tahorat oladi",
      "Umuman tahorat olmaydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «من استحاضة او رعاف او نحوهما يتوضأ لوقت كل فرض ويصلي به فيه ما شاء فرضا ونفلا». Har bir farz vaqti uchun tahorat oladi va o'sha vaqt ichida xohlagancha farz va nafl o'qiydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 8-bet"
  ),
  Question(
    id = 28,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Najasati g'aliza (og'ir najosat) qancha miqdorgacha afv etiladi (namozga mone' bo'lmaydi)?",
    options = listOf(
      "Tanga (dirham) miqdoricha yoki undan oz bo'lsa",
      "Kiyimning to'rtdan birigacha",
      "Bir hovuchgacha",
      "Umuman zarrasi ham afv etilmaydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «ويعفى ما دون ربع الثوب من نجس خفيف... وعن سائر ما خرج من المخرجين والدم والخمر فيعفى منه قدر الدرهم». Og'ir najosatdan dirham miqdorigacha afv etiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 9-bet"
  ),
  Question(
    id = 29,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Najasati xafifa (yengil najosat) kiyim yoki a'zoning qancha qismigacha kechiriladi?",
    options = listOf(
      "Dirham miqdorigacha",
      "Tegishli a'zo yoki kiyimning to'rtdan biridan (rub'idan) kam bo'lsa",
      "Yarimigacha",
      "Butun kiyimga yoyilsa ham"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويعفى ما دون ربع الثوب من نجس خفيف كبول فرس وما اكل لحمه». Yengil najosat kiyimning to'rtdan biridan kamida afv etiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 9-bet"
  ),
  Question(
    id = 30,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Quyidagilardan qaysi biri bilan istinjo qilish makruh?",
    options = listOf(
      "Toza tosh va kesak bilan",
      "Suyak, tezak, taom va o'ng qo'l bilan",
      "Paxta bilan",
      "Suv bilan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «الاستنجاء من كل حدث غير النوم والريح بنحو حجر حتى ينقيه سنة ولا بعظم ولا بروث ويمين». Suyak, tezak va o'ng qo'l bilan istinjo qilish man etilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 10-bet"
  ),

  // NAMOZ 1: VAQTLAR, SHARTLAR, SIFATLAR (31 - 60)
  Question(
    id = 31,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Bomdod namozining vaqti qachondan qachongacha hisoblanadi?",
    options = listOf(
      "Yarim tundan quyosh botguncha",
      "Subhi sodiq (ikkinchi tong) otganidan to quyosh chiqquncha",
      "Qorong'u tushgandan to quyosh tikkaga kelguncha",
      "Subhi kozibdan to peshingacha"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقت الفجر من الصبح المعترض الى الطلوع». Subhi sodiqdan to quyosh chiqquncha bo'lgan vaqt bomdod vaqtidir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 10-bet"
  ),
  Question(
    id = 32,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Peshin namozining oxirgi vaqti Imomi A'zam Abu Hanifa (r.a.) nazdida qachongacha davom etadi?",
    options = listOf(
      "Narsaning soyasi o'z bo'yiga teng bo'lguncha (misli avval)",
      "Zavol soyasidan tashqari, har bir narsaning soyasi o'ziga nisbatan ikki barobar bo'lguncha (mislayn)",
      "Quyosh butunlay botguncha",
      "Shom namozi azonigacha"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والظهر من الزوال الى بلوغ ظل كل شيء مثليه سوى فئ الزوال». Abu Hanifa (r.a.) nazdida narsaning soyasi zavol soyasidan tashqari ikki barobar bo'lgunchadir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 10-bet"
  ),
  Question(
    id = 33,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Shom namozining vaqti qachon tugaydi?",
    options = listOf(
      "Quyosh botishi bilan",
      "Shafaq (qizarish yoki oqlik) yo'qolishi bilan",
      "Yarim tunda",
      "Xufton namozi o'qilishi bilan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والمغرب منه الى غيبة الشفق وهو الحمرة وبه يفتى». Shafaq g'oyib bo'lguncha (fatvo berilgan qavlga ko'ra qizillik ketguncha).",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 10-11-bet"
  ),
  Question(
    id = 34,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Bomdod namozini erkaklar uchun qaysi vaqtda o'qish mustahab hisoblanadi?",
    options = listOf(
      "Zim-ziyo qorong'uda (g'alasda)",
      "Tong yorishganda (isforda)",
      "Quyosh chiqqandan keyin",
      "Peshin vaqtiga yaqin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويستحب للفجر البداية مسفرا بحيث يمكنه ترتيل اربعين آية ثم الاعادة ان ظهر فساد وضوئه». Tong yorishganda (isfor) o'qish mustahabdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 11-bet"
  ),
  Question(
    id = 35,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Quyidagi uch vaqtda qanday namozlarni o'qish joiz emas?",
    options = listOf(
      "Quyosh chiqayotganda, qiyomda turganda (zavolda) va botayotganda — hech qanday farz, qazo, janoza yoki tilovat sajdasi joiz emas (faqat o'sha kungi asr mustasno)",
      "Har doim nafl namoz o'qish mumkin",
      "Faqat janoza o'qish mumkin, boshqasi yo'q",
      "Faqat vitr o'qish mumkin"
    ),
    correctIndex = 0,
    explanation = "Matnda: «ولا يجوز صلاة وسجدة تلاوة وصلوة جنازة عند طلوعها وقيامها وغروبها الا عصر يومه». Quyosh chiqishi, qiyomi va botishi vaqtida namoz mutlaqo joiz emas (faqat o'sha kunning asri botayotganda o'qib olinadi).",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 11-bet"
  ),
  Question(
    id = 36,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Azon va iqomatning hukmi nima?",
    options = listOf(
      "Har bir inson uchun farzi ayn",
      "Besh vaqt farz va Juma namozi uchun sunnati muakkada",
      "Muboh",
      "Vojib"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الاذان سنة للفرائض والجمعة فقط في وقتها». Azon besh vaqt farz va juma uchun sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 11-bet"
  ),
  Question(
    id = 37,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Azon aytayotganda muazzin yuzini qayerga buradi?",
    options = listOf(
      "Faqat chapga buradi",
      "«Hayya 'alas-solah»da o'ng tomonga, «Hayya 'alal-falah»da chap tomonga buradi",
      "Faqat orqaga qaraydi",
      "Boshini qimirlatmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويحول وجهه في الحيعلتين يمنة ويسرة». «Hayya alas-solah» va «Hayya alal-falah»da yuzini o'ng va chapga buradi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 11-bet"
  ),
  Question(
    id = 38,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozning sihhari (durust bo'lishi) uchun nechta shart bor?",
    options = listOf(
      "3 ta: poklik, qibla va niyat",
      "6 ta: hadasdan poklik, najosatdan poklik, satri avrat, qiblaga yuzlanish, vaqt va niyat",
      "8 ta",
      "4 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل شروط الصلوة هي طهر بدن المصلي من حدث او خبث وثوبه ومكانه وستر عورته واستقبال القبلة والنية والوقت». Bular namozning tashqi shartlaridir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 12-bet"
  ),
  Question(
    id = 39,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Erkak kishining avrat chegarasi qayerdan qayergacha?",
    options = listOf(
      "Bo'yindan tizzagacha",
      "Kindik ostidan to tizzaning ostigacha (tizza ham avrat)",
      "Faqat oldi va orqasi",
      "Yelkasidan tovonigacha"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وعورة الرجل من تحت سرته الى تحت ركبته والركبة من العورة». Kindik ostidan to tizza ostigacha, tizzaning o'zi ham avrat hisoblanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 12-bet"
  ),
  Question(
    id = 40,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Hur (ozod) ayol kishining namozda avrat bo'lmagan a'zolari qaysilar?",
    options = listOf(
      "Faqat ko'zlari",
      "Yuzi, ikki kafti va ikki oyog'ining qadami (yuz va kaftlar mutlaqo avrat emas)",
      "Boshi va bo'yni",
      "Butun tanasi yuzidan boshqa hammasi yopiq bo'lishi kerak"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والحرة كل بدنها الا الوجه والكف والقدم». Ozod ayolning butun badani avratdir, faqat yuzi, kaftlari va qadamlari bundan mustasno.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 12-bet"
  ),
  Question(
    id = 41,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Avrat a'zosining qancha qismi ochilib qolsa namoz buziladi?",
    options = listOf(
      "Zarrasi ochilsa ham",
      "O'sha a'zoning to'rtdan bir qismi (rub'i) miqdoricha ochilsa",
      "Yarmi ochilsa",
      "Faqat butun a'zo ochilsa"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وكشف ربع العضو يمنع الصلوة». Avrat bo'lgan bir a'zoning to'rtdan bir qismi ochilishi namozni man' qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 12-bet"
  ),
  Question(
    id = 42,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Qiblani bilmagan kishi nima qilishi kerak?",
    options = listOf(
      "Namoz o'qimay kutib turadi",
      "Qiblani surishtiradi va qalbida qasd qilib taharriy (ijtihod) qilib o'qiydi",
      "Xohlagan tomoniga qarab o'qiyveradi",
      "Faqat sharqqa qarab o'qiydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقبلة خائف الاستقبال جهة قدرته وان عدم من يعلم تحرى ولم يعد». Qiblani bilmagan va o'rgatuvchi topilmagan kishi surishtirib, qasd (taharriy) qilib o'qiydi va qaytarmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-bet"
  ),
  Question(
    id = 43,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozning ichki farzlari (ruknlari) nechta?",
    options = listOf(
      "4 ta",
      "6 ta: Tahrima (takbir), Qiyom, Qiroat, Ruku', Sujud, Qada'i oxira",
      "8 ta",
      "10 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فرضها التحريمة والقيام وقراءة آية في كل من ركعتي الفرض وفي كل من الوتر والنفل... والركوع والسجود... والقعدة الاخيرة قدر التشهد والخروج بصنعه».",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-bet"
  ),
  Question(
    id = 44,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozda farz bo'lgan eng kam qiroat miqdori qancha?",
    options = listOf(
      "Fotiha surasi to'liq",
      "Bir uzun oyat yoki uchta qisqa oyat",
      "Uch pora",
      "Yarim pora"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقراءة آية... والمكتفى بها مسمى وعندهما آية طويلة او ثلث قصار». Farz qiroat bitta uzun oyat yoki uchta qisqa oyatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-bet"
  ),
  Question(
    id = 45,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozda sajdada peshona bilan birga burni yerga qo'yishning hukmi nima?",
    options = listOf(
      "Sunnat",
      "Peshona bilan burunni birga qo'yish vojib, faqat uzr bilan burnining o'ziga qilish joiz",
      "Mustahab",
      "Farz emas, bekorchi amal"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والسجود بالجبهة والانف وبه يفتى». Sajdani peshona va burun bilan qilish kerak, fatvo shugadir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-bet"
  ),
  Question(
    id = 46,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozning vojiblari qatoriga quyidagilardan qaysi biri kiradi?",
    options = listOf(
      "Fotiha surasini o'qish, zam sura qo'shish, tartib, birinchi qa'da va tashahhud o'qish",
      "Faqat takbiri tahrima",
      "Faqat ruku' qilish",
      "Faqat salom berish"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وواجبها قراءة الفاتحة وضم سورة ورعاية الترتيب والقعدة الاولى والتشهد ان ولفظ السلام وقنوت الوتر وتكبيرات العيدين...». Bular namozning vojiblaridir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-14-bet"
  ),
  Question(
    id = 47,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozni boshlashda erkaklar qo'llarini qayergacha ko'taradilar?",
    options = listOf(
      "Yelka barobarigacha",
      "Bosh barmoqlarini quloq yumshoqlariga tekkizguncha",
      "Ko'krak qafasigacha",
      "Boshidan yuqoriga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كبر بلا مد الهمزة والباء ماسا بابهاميه شحمتي اذنيه والمرأة ترفع يديها حذاء منكبيها». Erkaklar bosh barmoqlarini quloq yumshog'iga yetkazadi, ayollar esa yelka barobarigacha ko'taradi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14-bet"
  ),
  Question(
    id = 48,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Qiyomda erkaklar qo'llarini qayerga bog'laydilar?",
    options = listOf(
      "Ko'krak ustiga",
      "O'ng qo'lni chap qo'l ustiga qo'yib, kindik ostiga",
      "Yonlariga tushirib qo'yadilar",
      "Qorin ustiga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويضع يمينه على شماله تحت سرته». Erkaklar o'ng qo'lini chap qo'l ustiga qo'yib, kindik ostiga bog'laydilar.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14-bet"
  ),
  Question(
    id = 49,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozda «Sano» (Subhanakallohumma) duosini o'qishning hukmi nima?",
    options = listOf(
      "Farz",
      "Vojib",
      "Sunnat",
      "Makruh"
    ),
    correctIndex = 2,
    explanation = "Matnda: «ثم يثني...» Tahrima takbiridan so'ng Sano o'qish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14-bet"
  ),
  Question(
    id = 50,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Imom orqasida iqtido qilgan kishi («Muqtadiy») Fotiha va zam surani o'qiydimi?",
    options = listOf(
      "Ha, har bir rakatda o'qishi farz",
      "Yo'q, imom orqasida jim quloq solib turadi (sukut saqlaydi)",
      "Faqat ichida pichirlaydi",
      "Faqat ovoz chiqarmaydigan namozlarda o'qiydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وينصت المؤتم وكذا في الخطبة الا اذا قرأ صلوا عليه فيصلى السامع سرا... والمؤتم لا يقرأ». Hanafiy mazhabida muqtadiy imom orqasida qiroat qilmaydi, jim turadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14, 17-bet"
  ),
  Question(
    id = 51,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Ruku'da aytiladigan tasbeh qaysi va uning eng kam miqdori nechta?",
    options = listOf(
      "«Subhana Robbiyal A'lo» — 1 marta",
      "«Subhana Robbiyal 'Aziym» — eng ozi 3 marta",
      "«Alhamdulillah» — 5 marta",
      "«Allohu Akbar» — 7 marta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويسبح ثلثا وهو ادناه... سبحان ربي العظيم». Ruku'da «Subhana Robbiyal 'Aziym» deb kamida 3 marta tasbeh aytish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14-bet"
  ),
  Question(
    id = 52,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Ruku'dan qaytganda imom va muqtadiy nima deydi?",
    options = listOf(
      "Ikkalasi ham faqat takbir aytadi",
      "Imom: «Sami'allohu liman hamidah», muqtadiy esa: «Robbana lakal hamd» deydi",
      "Muqtadiy ikkalasini ham aytadi, imom hech narsa demaydi",
      "Hech qaysisi aytmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ثم يسمع رافعا رأسه ويكتفى به الامام وبالتحميد المؤتم ويجمع بينهما المنفرد». Imom tasmi' («Sami'allohu liman hamidah»), muqtadiy tahmid («Robbana lakal hamd») deydi, yolg'iz o'quvchi ikkalasini jamlaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 14-15-bet"
  ),
  Question(
    id = 53,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Sajdaga borishda avval yerga qaysi a'zolar qo'yiladi?",
    options = listOf(
      "Avval qo'llar, keyin tizzalar",
      "Avval tizzalar, keyin qo'llar, so'ngra peshona va burun",
      "Avval bosh",
      "Ixtiyoriy"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ثم يكبر ويسجد فيضع ركبتيه ثم يديه ثم وجهه». Avval tizzasini, keyin qo'llarini, so'ngra yuzini qo'yadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 15-bet"
  ),
  Question(
    id = 54,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Erkaklar sajdada qo'l va qorinlarini qanday tutadilar?",
    options = listOf(
      "Tirsaklarini yerga to'liq yoyib, qorinni songa yopishtiradilar",
      "Qorinni sondan, tirsaklarni biqindan va bilaklarni yerdan uzoq (ochiq) tutadilar",
      "Qo'llarini orqaga bog'laydilar",
      "Faqat bir qo'l bilan sajda qiladilar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مجافيا بطنه عن فخذيه موجها اصابع رجليه نحو القبلة... والمرأة تخفض وتلزق بطنها بفخذيها». Erkak kishi qornini sonidan, bilaklarini yerdan yiroq tutadi, ayol kishi esa aksincha o'zini jamlab yopishtiradi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 15-bet"
  ),
  Question(
    id = 55,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Qadada (o'tirishda) erkaklar qanday o'tiradilar («Iftirosh»)?",
    options = listOf(
      "Ikki oyog'ini o'ng tomondan chiqarib (tavarruk)",
      "Chap oyog'ini to'shab ustiga o'tiradilar, o'ng oyog'ini esa qiblaga qaratib tik tutadilar",
      "Chortoq qurib o'tiradilar",
      "Oyoqlarini tovon ustiga tiklab o'tiradilar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «افترش رجل اليسرى وجلس عليها ناصبا يمناه موجها اصابعه نحو القبلة». Erkak chap oyog'ini yoyib ustiga o'tiradi, o'ngini tiklaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 15-bet"
  ),
  Question(
    id = 56,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Ayollar namozda qadada qanday o'tiradilar («Tavarruk»)?",
    options = listOf(
      "Xuddi erkaklardek chap oyoq ustiga",
      "Ikki oyog'ini o'ng tomondan chiqarib, chap dumbasi bilan yerga o'tiradilar",
      "Tizzalab tik turadilar",
      "Chortoq quradilar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والمرأة تجلس على أليتها اليسرى مخرجة رجليها من الجانب الايمن». Ayol kishi ikki oyog'ini o'ng tomondan chiqarib, chap dumbasiga o'tiradi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 15-bet"
  ),
  Question(
    id = 57,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Hanafiy mazhabida qaysi sahobiyning tashahhudi («Attahiyyatu») o'qiladi?",
    options = listOf(
      "Ibn Abbos (r.a.) tashahhudi",
      "Abdulloh ibn Mas'ud (r.a.) tashahhudi",
      "Jobir ibn Abdulloh (r.a.) tashahhudi",
      "Oisha (r.a.) tashahhudi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويتشهد كابن مسعود». Abdulloh ibn Mas'ud (r.a.) rivoyat qilgan tashahhud lafzi o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 15-bet"
  ),
  Question(
    id = 58,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Farz namozlarining uchinchi va to'rtinchi rakatlarida qiroat qilishning hukmi nima?",
    options = listOf(
      "Faqat Fotiha surasi o'qiladi, agar tasbeh aytsa yoki sukut saqlasa ham joiz",
      "Har doim zam sura qo'shish farz",
      "Qiroat qilish harom",
      "Uchta sura qo'shish vojib"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وقرأ فيها بعد الاوليين الفاتحة فقط وان سبح او سكت جاز». Oxirgi ikki rakatda faqat Fotiha o'qiladi, agar tasbeh aytsa yoki jim tursa ham namoz joiz.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 16-bet"
  ),
  Question(
    id = 59,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Qaysi namozlarda imom qiroatni ovoz chiqarib (jahr) o'qiydi?",
    options = listOf(
      "Peshin va asrda",
      "Bomdod, Shom va Xuftonning avvalgi ikki rakatida, Juma va Hayit namozlarida",
      "Faqat tarovehda",
      "Faqat janozada"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يجهر الامام في الجمعة والعيدين والفجر واوليي العشائين». Bomdod, ikki hayit, juma va shom hamda xuftonning dastlabki ikki rakatida imom jahriy o'qiydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 16-bet"
  ),
  Question(
    id = 60,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Tiyvolul mufassal (uzun mufassal suralar) qaysi namozlarda o'qilishi sunnat?",
    options = listOf(
      "Asr va shomda",
      "Bomdod va peshin namozlarida",
      "Faqat vitrda",
      "Faqat janozada"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واستحسنوا طوال المفصل في الفجر والظهر واوساطه في العصر والعشاء وقصاره في المغرب». Bomdod va peshinda uzun, asr va xuftonda o'rtacha, shomda qisqa mufassal suralar o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 16-bet"
  ),

  // NAMOZ 2: IMOMAT, SAJDALAR, MAXSUS NAMOZLAR (61 - 85)
  Question(
    id = 61,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Imomlikka eng haqli kishi kim hisoblanadi?",
    options = listOf(
      "Eng boy kishi",
      "Sunnatni (fiqh ilmini) eng yaxshi biluvchi, so'ngra qiroati eng yaxshi bo'lgan, so'ngra eng taqvodor (avra'), so'ngra yoshi ulug'roq kishi",
      "Eng ovozi baland kishi",
      "Faqat yoshi katta kishi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والاولى بالامامة الاعلم بالسنة ثم الاقرأ ثم الاورع ثم الاسن». Sunnatni biluvchi, so'ng eng qiroatli, so'ng taqvodor, so'ng yoshi ulug'.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 17-bet"
  ),
  Question(
    id = 62,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Bitta kishi imomga iqtido qilganda qayerda turadi?",
    options = listOf(
      "Imomning orqasida to'g'ri markazda",
      "Imomning o'ng tomonida (barobar yoki sal orqaroqda)",
      "Imomning chap tomonida",
      "Imomning oldida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويقوم المؤتم الواحد على يمينه والزائد خلفه». Bitta muqtadiy imomning o'ng tomonida turadi, undan ko'p bo'lsa orqasida saf tortadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 17-bet"
  ),
  Question(
    id = 63,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Namozda saflarning to'g'ri tartibi qanday bo'ladi?",
    options = listOf(
      "Oldinda bolalar, keyin erkaklar, keyin ayollar",
      "Oldingi safda erkaklar, keyin yosh bolalar, so'ngra xunsolar, eng orqada ayollar",
      "Hamma aralashib turadi",
      "Oldinda ayollar, orqada erkaklar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويصف الرجال ثم الصبيان ثم الخناثى ثم النساء». Erkaklar, so'ng bolalar, so'ng xunsolar, so'ng ayollar safi bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 17-bet"
  ),
  Question(
    id = 64,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Ayol kishi erkak kishi bilan bir safda yonma-yon namoz o'qisa («Muhozatun nisa») nima bo'ladi?",
    options = listOf(
      "Hech narsa bo'lmaydi",
      "Erkakning namozi fosid (botil) bo'ladi",
      "Ayolning namozi buziladi, erkakniki qoladi",
      "Faqat savobi kamayadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان حاذته في صلوة مشتركة تحريمة واداء فسدت صلوته دونها». Bir namozda ayol erkakning yonida tursa, erkakning namozi buziladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 17-bet"
  ),
  Question(
    id = 65,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Amali kasir (ko'p harakat) deb qanday harakatga aytiladi va u namozni buzadimi?",
    options = listOf(
      "Kiyimni bir marta to'g'rilash",
      "Uzoqdan qaragan odam namoz o'qimayapti deb aniq o'ylaydigan harakat; u namozni buzadi",
      "Sajdaga borish",
      "Salom berish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والعمل الكثير او يظن الناظر ان عامله غير مصل». Qaragan kishi uni namozda emas deb qat'iy o'ylaydigan harakat amali kasir bo'lib, namozni buzadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 18-19-bet"
  ),
  Question(
    id = 66,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Namozda qasddan yoki adashib so'zlashish namozni qanday holatga keltiradi?",
    options = listOf(
      "Hech narsa qilmaydi",
      "Namozni mutlaqo buzadi (yufsiduha)",
      "Faqat sajdai sahv lozim bo'ladi",
      "Namoz makruh bo'ladi xolos"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل يفسدها الكلام مطلقا والسلام عمدا او رده». Har qanday gaplashish namozni mutlaqo buzadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 18-bet"
  ),
  Question(
    id = 67,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Vitr namozi Hanafiy mazhabida necha rakat va uning hukmi nima?",
    options = listOf(
      "1 rakat, sunnat",
      "3 rakat bir salom bilan, vojib",
      "5 rakat, farz",
      "2 rakat, mustahab"
    ),
    correctIndex = 1,
    explanation = "Matnda: «الوتر ثلاث ركعات وجب بسلام واحد وقبل ركوع الثالثة يكبر رافعا يديه ثم يقنت». Vitr 3 rakat bo'lib, bir salom bilan o'qiladi va u vojibdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 20-bet"
  ),
  Question(
    id = 68,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Vitr namozida Qunut duosi qachon o'qiladi?",
    options = listOf(
      "Birinchi rakatda",
      "Uchinchi rakatda ruku'dan oldin qo'llarni quloqqacha ko'tarib takbir aytgach",
      "Uchinchi rakatda ruku'dan keyin",
      "Salomdan keyin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقبل ركوع الثالثة يكبر رافعا يديه ثم يقنت فيه ابدا». Uchinchi rakatda ruku'dan oldin takbir aytib qo'l ko'tariladi va Qunut o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 20-bet"
  ),
  Question(
    id = 69,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Taroveh namozi necha rakat va har necha rakatda dam olinadi?",
    options = listOf(
      "8 rakat, dam olinmaydi",
      "20 rakat (o'nta salom bilan), har 4 rakatda bir tarviha (dam olish) qilinadi",
      "12 rakat",
      "30 rakat"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وسن التراويح قبل الوتر او بعده وعلى كل ترويحة اي اربع ركعات بتسليمتين جلسة بقدرها». Taroveh 20 rakat bo'lib, har 4 rakatda dam olinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 21-bet"
  ),
  Question(
    id = 70,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Bir kishi namozda bir ruknni kechiktirsa yoki vojibni unutib tark qilsa nima qilishi lozim?",
    options = listOf(
      "Namozni boshqatdan o'qiydi",
      "Sajdai sahv qiladi",
      "Istig'for aytadi xolos",
      "Hech narsa qilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يجب بعد سلام واحد سجدتان وتشهد وسلام اذا قدم ركنا او اخره او غير واجبا او تركه ساهيا». Unutib bir ruknni oldinga-orqaga sursa yoki vojibni tark qilsa, sajdai sahv vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 22-bet"
  ),
  Question(
    id = 71,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Sajdai sahv qanday ado etiladi?",
    options = listOf(
      "Oxirgi qa'dada tashahhuddan so'ng bir tomonga (o'ngga) salom berib, 2 marta sajda qiladi, so'ng yana tashahhud, salovot o'qib salom beradi",
      "Namoz ichida ruku'dan keyin darhol qilinadi",
      "Faqat bir marta sajda qilinadi",
      "Salomsiz qilinadi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «يجب بعد سلام واحد سجدتان وتشهد وسلام». Bir salomdan keyin ikki sajda qilib, tashahhud va salom beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 22-bet"
  ),
  Question(
    id = 72,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Muxtasarul Viqoyaga binoan Qur'oni Karimda nechta tilovat sajdasi oyati bor?",
    options = listOf(
      "10 ta",
      "14 ta",
      "15 ta",
      "12 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «تجب سجدة بين تكبيرتين بشرائط الصلوة... على من تلا آية من اربع عشرة آية». Hanafiy mazhabida tilovat sajdasi 14 ta oyatdadir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 23-bet"
  ),
  Question(
    id = 73,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Bemor kishi tik tura olmasa namozni qanday o'qiydi?",
    options = listOf(
      "O'tirib, ruku' va sajda qilib o'qiydi; agar bunga ham qodir bo'lmasa, imo-ishora bilan o'qiydi (sajda ruku'dan pastroq qilinadi)",
      "Namoz o'qimaydi, tuzalgach qazo qiladi",
      "Faqat yotib imo qiladi",
      "Boshqa odam uning o'rniga o'qiydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «ان تعذر القيام لمرض صلى قاعدا يركع ويسجد وان تعذرا مع القيام او ماء برأسه قاعدا... وجعل سجوده اخفض من ركوعه». Tik tura olmasa o'tirib, ruku'-sajdaga qodir bo'lmasa imo bilan o'qiydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 24-bet"
  ),
  Question(
    id = 74,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Musofir bo'lish uchun safar masofasi qancha bo'lishi kerak?",
    options = listOf(
      "Bir kunlik yo'l",
      "O'rtacha tuyada yoki piyoda yurishda 3 kecha-kunduzlik masofa (taxminan 88-90 km)",
      "10 kunlik yo'l",
      "500 km"
    ),
    correctIndex = 1,
    explanation = "Matnda: «من فارق بيوت بلده قاصدا مسافة ثلثة ايام ولياليها بسير وسط... فيقصر الرباعي الى اثنين». O'rtacha yurishda 3 kunlik masofaga yo'l olgan kishi 4 rakatlik farzlarni 2 rakat qilib qasr qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 25-bet"
  ),
  Question(
    id = 75,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Musofir kishi bir joyda necha kun turishni niyat qilsa muqimga aylanadi?",
    options = listOf(
      "3 kun",
      "15 kun (yarim oy) yoki undan ortiq",
      "30 kun",
      "40 kun"
    ),
    correctIndex = 1,
    explanation = "Matnda: «او ينوى اقامة نصف شهر في بلدة». Bir shaharda 15 kun turishni niyat qilsa, muqim bo'lib namozlarini to'liq o'qiydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 25-bet"
  ),
  Question(
    id = 76,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Musofir kishi 4 rakatlik farz namozni qasddan 4 rakat qilib o'qisa nima bo'ladi?",
    options = listOf(
      "Savobi ko'proq bo'ladi",
      "Agar ikkinchi rakatda o'tirgan bo'lsa, farzi ado bo'ladi, lekin gunohkor (isota) bo'ladi, keyingi ikki rakat nafl bo'ladi; agar ikkinchi rakatda o'tirmagan bo'lsa farzi botil bo'ladi",
      "Mutlaqo namozi qabul bo'lmaydi",
      "Hech qanday farqi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فلو اتم وقعد الاولى تم فرضه واساء وما زاد نفل وان لم يقعد بطل فرضه». Ikkinchi rakatda o'tirgan bo'lsa farz o'tadi ammo yomon ish qilgan bo'ladi, o'tirmasa farz botil bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 25-bet"
  ),
  Question(
    id = 77,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Quyosh tutilganda (Kusuf) qanday namoz o'qiladi?",
    options = listOf(
      "4 rakat ovoz chiqarib",
      "Juma imomi odamlar bilan 2 rakat nafl namoz o'qiydi, qiroati maxfiy va uzun bo'ladi, so'ngra quyosh ochilguncha duo qilinadi",
      "Azon aytib janoza namozi o'qiladi",
      "Namoz o'qilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل عند الكسوف يصلى امام الجمعة بالناس ركعتين نفلا مخفيا قراءته مطولا فيهما ثم يدعو حتى تنجلي الشمس». Juma imomi xalq bilan qiroatni maxfiy qilib 2 rakat o'qiydi va duo qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 21-bet"
  ),
  Question(
    id = 78,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Qazo namozlari o'rtasida tartibga rioya qilish (tartib) kimga farz?",
    options = listOf(
      "Umuman hech kimga farz emas",
      "Qazo namozlari oltitadan kam bo'lgan kishiga («Sohibi tartib»)",
      "Qazolari yuzlab bo'lgan kishiga",
      "Faqat Ramazonda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل فرض الترتيب بين الفروض الخمسة والوتر... الا اذا ضاق الوقت او نسي او فاتت ست». Qazolar oltitaga yetmaguncha yoki vaqt toraymaguncha tartibga rioya qilish farzdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 22-bet"
  ),
  Question(
    id = 79,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Namozda necha rakat o'qiganiga birinchi marta shak qilsa nima qiladi?",
    options = listOf(
      "Kamiga bino qiladi",
      "Namozni boshidan qayta boshlaydi (yasta'nifu)",
      "Ko'piga bino qiladi",
      "Namozni buzib ketadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومن شك اول مرة انه كم صلى استأنف». Birinchi marta shak qilsa namozni yangitdan boshlaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 23-bet"
  ),
  Question(
    id = 80,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Agar shak qilish unga tez-tez uchrab tursa («kasirat-tavahhum») nima qiladi?",
    options = listOf(
      "Har safar namozni boshidan boshlaydi",
      "G'olibi gumoniga qaraydi, agar gumoni bo'lmasa eng oziga bino qiladi va har bir rakatda o'tiradi",
      "Namozni o'qimaydi",
      "Ixtiyoriy o'qiyveradi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان كثير اخذ بغالب الظن وان لم يغلب فبالاقل ويقعد حيث توهمه آخر صلوته». Ko'p shak tushsa g'olib gumonga, u ham bo'lmasa eng oziga suyanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 23-bet"
  ),
  Question(
    id = 81,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Bir joyda o'tirib bitta sajda oyatini bir necha bor takror o'qisa necha marta tilovat sajdasi vojib bo'ladi?",
    options = listOf(
      "O'qiganicha (masalan 10 marta)",
      "Bitta majlisda bo'lgani uchun bitta sajda kifoya qiladi",
      "Hech qanday sajda vojib emas",
      "Har doim 2 tadan sajda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان كرر في مجلس او صلوة يكفي سجدة». Bir majlisda yoki bir namozda takrorlansa bitta sajda kifoya qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 24-bet"
  ),
  Question(
    id = 82,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Kemada ketayotgan kishi uzrsiz o'tirib namoz o'qisa bo'ladimi?",
    options = listOf(
      "Abu Hanifa (r.a.) nazdida uzrsiz ham o'tirib o'qishi joiz (lekin tik turish afzal), sohibayn nazdida uzrsiz joiz emas",
      "Mutlaqo joiz emas",
      "Faqat nafl o'qishi mumkin",
      "Kemada namoz o'qilmaydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «صلى قاعدا في فلك جار بلا عذر صح». Yurib turgan kemada uzrsiz ham o'tirib o'qish Abu Hanifada joiz, lekin turish afzal.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 25-bet"
  ),
  Question(
    id = 83,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Quyidagilardan qaysi biri jamoat namozida imomga iqtido qilishni man' qiladi?",
    options = listOf(
      "Imom va muqtadiy orasida katta daryo yoki ommaviy katta yo'l o'tgan bo'lsa",
      "Imom baland joyda tursa",
      "Muqtadiy ko'r bo'lsa",
      "Imom yosh bo'lsa"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وبينهما نهر تجري فيه السفن او طريق يمر فيه الناس». Orada qayiqlar o'tadigan katta daryo yoki aravayu odamlar qatnaydigan katta yo'l bo'lsa iqtido durust bo'lmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 17-18-bet"
  ),
  Question(
    id = 84,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Namozda mushafga (kitobga) qarab qiroat qilishning hukmi nima?",
    options = listOf(
      "Mustahab",
      "Abu Hanifa (r.a.) nazdida namozni buzadi",
      "Har doim sunnat",
      "Vojib"
    ),
    correctIndex = 1,
    explanation = "Matnda mufsidlar qatorida: «والقراءة من مصحف». Abu Hanifa (r.a.) nazdida namoz ichida mushafdan o'qish namozni buzadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 18-bet"
  ),
  Question(
    id = 85,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Namozxon o'z oldidan o'tayotgan odamni qanday to'sadi?",
    options = listOf(
      "Uni qo'li bilan urib yiqitadi",
      "Tasbeh aytish («Subhanalloh») yoki imo-ishora qilish bilan qaytaradi",
      "Baqirib so'zlaydi",
      "Namozni buzadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويدرأ بالتسبيح او الاشارة». O'tuvchini tasbeh aytish yoki ishora qilish bilan qaytaradi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 20-bet"
  )
)
