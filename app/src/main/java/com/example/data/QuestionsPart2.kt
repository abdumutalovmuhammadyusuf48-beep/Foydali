package com.example.data

import com.example.model.Question
import com.example.model.QuestionDifficulty

val questionsPart2: List<Question> = listOf(
  // NAMOZ 3: JUMA, HAYIT, JANOZA, SHAHID (86 - 110)
  Question(
    id = 86,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Juma, Hayit va Janoza",
    questionText = "Juma namozi vojib bo'lishining shartlari qaysilar?",
    options = listOf(
      "Erkak, hur (ozod), sog'lom, muqim va ko'zi ochiq bo'lish",
      "Faqat balog'atga yetgan bo'lsa kifoya",
      "Musofir va qullarga ham farz",
      "Faqat olim kishilarga farz"
    ),
    correctIndex = 0,
    explanation = "Matnda: «فصل شرط لوجوب الجمعة الاقامة بمصر والصحة والحرية والذكورة وسلامة العين والرجل». Juma vojib bo'lish shartlari: shahar (iqomat), salomatlik, ozodlik, erkaklik, ko'z va oyoqning salomat bo'lishi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 26-bet"
  ),
  Question(
    id = 87,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Juma, Hayit va Janoza",
    questionText = "Juma namozining ado etilishi (durust bo'lishi) uchun nechta jamoat shart (Abu Hanifa r.a. nazdida)?",
    options = listOf(
      "Imomdan tashqari kamida 3 nafar erkak kishi",
      "Kamida 40 kishi",
      "Kamida 12 kishi",
      "Faqat 1 kishi kifoya"
    ),
    correctIndex = 0,
    explanation = "Matnda: «والجماعة اي ثلاثة رجال سوى الامام». Abu Hanifa (r.a.) nazdida imomdan tashqari kamida 3 nafar erkak jamoat bo'lishi shartdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 26-bet"
  ),
  Question(
    id = 88,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Juma kuni imom minbarga xutbaga chiqqanida namozxonlar nima qilishlari shart?",
    options = listOf(
      "Nafl namoz o'qishda davom etish",
      "Barcha namoz va so'zlashishdan to'xtab, jim quloq solish (xutba tugaguncha)",
      "Qur'on tilovat qilish",
      "Bir-biri bilan salomlashish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واذا خرج الامام للخطبة حرم الصلوة والكلام حتى يتم الخطبة». Imom xutbaga chiqqan vaqtdan to xutba tugaguncha namoz o'qish va gaplashish haromdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 26-bet"
  ),
  Question(
    id = 89,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Hayit namozlarining hukmi nima va u necha rakat o'qiladi?",
    options = listOf(
      "Sunnat, 4 rakat",
      "Vojib, 2 rakat",
      "Farzi kifoya, 2 rakat",
      "Nafl, 1 rakat"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل... وصلى الامام ركعتين... ويكبر ثلاثا رافعا يديه». Hayit namozi Juma vojib bo'lgan kishilarga vojibdir va 2 rakat o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 27-bet"
  ),
  Question(
    id = 90,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Hayit namozlarida nechta qo'shimcha (zoid) takbir aytiladi?",
    options = listOf(
      "4 ta",
      "6 ta: birinchi rakatda qiroatdan oldin 3 ta, ikkinchi rakatda qiroatdan keyin ruku'dan oldin 3 ta",
      "12 ta",
      "8 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويكبر ثلاثا رافعا يديه بعد الثناء وفي الركعة الثانية بعد القراءة». Birinchi rakatda Sanodan so'ng 3 takbir, ikkinchi rakatda qiroatdan so'ng 3 takbir aytiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 27-bet"
  ),
  Question(
    id = 91,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Takbiri tashriq («Allohu Akbar, Allohu Akbar, La ilaha illallohu...») qachondan qachongacha aytiladi?",
    options = listOf(
      "Faqat Hayit kuni peshinda",
      "Arafa kuni bomdod namozidan boshlab to Hayitning to'rtinchi kuni asr namozigacha (jami 23 vaqt farz namozidan keyin)",
      "Faqat 3 kun",
      "Ramazon oyida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويجب... من فجر يوم عرفة عقيب كل فرض ادى بجماعة مستحبة... الى عصر آخر ايام التشريق وبه يعمل». Arafa tongidan to to'rtinchi kun asrigacha farz namozlaridan keyin takbir aytish vojibdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 27-28-bet"
  ),
  Question(
    id = 92,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Vafot etgan kishini kafanlashda sunnat bo'lgan kafanlar erkak kishi uchun nechta?",
    options = listOf(
      "1 ta",
      "3 ta: izor, qamis va lifofa",
      "5 ta",
      "7 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وسنة الكفن له ازار وقميص ولفافة». Erkak uchun sunnat kafan 3 qismdir: izor, ko'ylak (qamis) va lifofa.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 93,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Ayol kishi uchun sunnat kafan nechta qismdan iborat?",
    options = listOf(
      "3 ta",
      "5 ta: izor, qamis, lifofa, ximor (ro'mol) va ko'krak bog'lagich (xirqa)",
      "7 ta",
      "2 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولها ازار وقميص ولفافة ويزاد لها الخمار وخرقة تربط بها ثدييها». Ayol kishi uchun 5 qism kafan sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 94,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Janoza namozi necha takbirdan iborat va uning hukmi nima?",
    options = listOf(
      "3 takbir, sunnat",
      "4 takbir, farzi kifoya",
      "5 takbir, vojib",
      "2 takbir, nafl"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وصلوته فرض كفاية وهي ان يكبر ويثنى ثم يكبر ويصلى على النبي... ثم يكبر ويدعو له ثم يكبر ويسلم». 4 takbir aytiladi va farzi kifoyadir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 95,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Janoza namozida qo'llar qaysi takbirda ko'tariladi?",
    options = listOf(
      "Har bir takbirda",
      "Faqat birinchi takbirda",
      "Faqat to'rtinchi takbirda",
      "Hech birida ko'tarilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يرفع اليد الا في الاول». Janozada qo'llar faqat birinchi takbirdagina quloqqa ko'tariladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 96,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Hanafiy mazhabida haqiqiy shahid deb kimga aytiladi?",
    options = listOf(
      "Har qanday o'lgan kishiga",
      "Dushmanlar tomonidan o'ldirilgan yoki qaroqchilar tarafidan zulman, qurol bilan o'ldirilgan va dunyo matohlaridan foydalanmay vafot etgan balog'atga yetgan pok musulmon",
      "Faqat suvga cho'kib o'lganga",
      "Kasal bo'lib o'lganga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الشهيد هو مسلم طاهر بالغ قتل ظلما ولم يجب به مال ولم يرتث... ولا يغسل ويصلى عليه ويدفن بدمه».",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),
  Question(
    id = 97,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Shahid bo'lgan kishining janozasi va yuvilishi qanday bo'ladi?",
    options = listOf(
      "G'usl qildiriladi va janozasiz ko'miladi",
      "Yuvilmaydi, qonli kiyimlarida janozasi o'qilib dafn qilinadi",
      "Yuviladi va janozasi ham o'qiladi",
      "Kafanlanmaydi ham"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يغسل ويصلى عليه ويدفن بدمه». Shahid g'usl qildirilmaydi, qoni bilan dafn qilinadi va unga janoza namozi o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),
  Question(
    id = 98,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Mayyit qabrga qo'yilayotganda nima deb aytish sunnat?",
    options = listOf(
      "«Allohu Akbar» deb qichqirish",
      "«Bismillahi va 'ala millati Rasulillah» (باسم الله وعلى ملة رسول الله)",
      "Hech narsa aytilmaydi",
      "Faqat Fotiha surasi o'qiladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويدخل فيه مما يلى القبلة ويقول واضعه: بسم الله وعلى ملة رسول الله ويوجه الى القبلة».",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),
  Question(
    id = 99,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Mayyitning qabri usti qanday shaklda qilinadi?",
    options = listOf(
      "Tekis qilib tosh yotqiziladi",
      "Tuya o'rkachidek qabartiriladi (musannam)",
      "Baland bino qilinadi",
      "Chuqur qilib qoldiriladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويسنم القبر». Qabr tuya o'rkachiga o'xshatib bir qarich miqdorida qabartiriladi, to'rtburchak tekislanmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),
  Question(
    id = 100,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Janozani ko'tarib yurishda to'rtta burchagidan ko'tarishning sunnat odobi qanday?",
    options = listOf(
      "Avval o'ng oldingi oyoq, so'ng o'ng orqa oyoq, so'ng chap oldingi, so'ng chap orqa oyoqdan 10 qadamdan ko'tarish",
      "Faqat mashinaga qo'yish",
      "Bir kishi ko'taradi",
      "Hech qanday tartibi yo'q"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وسن في حمل الجنازة وان تضع مقدمها على يمينك ثم مؤخرها ثم كذا على يسارك». Janozaning to'rt yog'ochini navbati bilan o'ng va chap yelkaga olib 10 qadamdan jami 40 qadam ko'tarish sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),
  Question(
    id = 101,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Xavf namozi qanday holatda o'qiladi?",
    options = listOf(
      "Dushman xavfi shiddatli bo'lganda, imom jamoatni ikki toifaga bo'lib, navbat bilan namoz o'qitadi",
      "Har kim uydan chiqmay o'qiydi",
      "Xavf vaqtida namoz bekor bo'ladi",
      "Faqat nafl o'qiladi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «فصل اذا اشتد خوف العدو جعل الامام امة نحو العدو وصلى باخرى ركعة...». Imom jamoatni ikki guruhga bo'lib navbatma-navbat namoz o'qiydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 30-bet"
  ),
  Question(
    id = 102,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Ka'baning ichida farz yoki nafl namoz o'qish joizmi?",
    options = listOf(
      "Yo'q, mutlaqo harom",
      "Ha, Ka'baning ichida farz ham, nafl ham o'qish durustdir",
      "Faqat nafl o'qish mumkin, farz emas",
      "Faqat janoza o'qish mumkin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل صح في الكعبة الفرض والنفل». Ka'ba ichida farz namozi ham, nafl namozi ham to'la durustdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 30-bet"
  ),
  Question(
    id = 103,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "O'zini o'zi o'ldirgan (o'z joniga qasd qilgan) kimsaga janoza namozi o'qiladimi?",
    options = listOf(
      "O'qilmaydi",
      "Abu Hanifa (r.a.) va Muhammad (r.a.) nazdida yuviladi va janozasi o'qiladi (Abu Yusuf o'qilmaydi degan)",
      "Kafanlanmaydi",
      "Ko'milmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومن قتل نفسه غسل وصلي عليه عند الطرفين خلافاً لابي يوسف». Abu Hanifa va Muhammad (rahimahumalloh) nazdida o'z joniga qasd qilganga ham janoza o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 30-bet"
  ),
  Question(
    id = 104,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Yomg'ir so'rash (Istisqo) namozi haqida Abu Hanifa (r.a.) ning qarashlari qanday?",
    options = listOf(
      "Maxsus jamoat sunnati yo'q, balki duo va istig'fordir, agar yolg'iz namoz o'qisalar joiz",
      "Har kuni farz",
      "4 rakat jahriy namoz",
      "Xutbasiz o'qilmaydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «والاستسقاء دعاء واستغفار... وان صلوا فرادى جاز». Abu Hanifada istisqo aslida duo va tavbadir, sohibaynda esa xutbali 2 rakat jamoat namozidir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 21-bet"
  ),
  Question(
    id = 105,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Janoza namozida imom mayyitning qaysi qismiga to'g'irlanib turadi?",
    options = listOf(
      "Mayyitning boshi ro'parasida",
      "Mayyitning ko'kragi ro'parasida",
      "Mayyitning oyoqlari ro'parasida",
      "Xohlagan joyida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويقوم الامام بحذاء الصدر». Imom mayyitning ko'kragi to'g'risida turadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 106,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Janoza namozi qiroatsiz, ruku'siz va sajdasiz bo'ladimi?",
    options = listOf(
      "Ha, faqat takbirlar, duo va salomdan iborat",
      "Yo'q, ruku' va sajdasi bo'lishi shart",
      "Faqat ruku'si bo'ladi",
      "Faqat bitta sajdasi bo'ladi"
    ),
    correctIndex = 0,
    explanation = "Janoza namozi qiyomda, 4 takbir, sano, salovot, duo va salom bilan ado etiladi, ruku' va sajdasi bo'lmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 107,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Agar bir kishi janoza namoziga kechikib kelib, imom ba'zi takbirlarni aytib bo'lgan bo'lsa nima qiladi?",
    options = listOf(
      "Namozga qo'shilmaydi",
      "Imom navbatdagi takbirni aytganda niyat qilib kiradi, imom salom bergach qolgan takbirlarini duosiz ketma-ket aytib salom beradi",
      "Imomni kutib turadi",
      "Boshidan o'zi o'qiydi"
    ),
    correctIndex = 1,
    explanation = "Matnda masbuq haqidagi qoidaga binoan imom bilan birga takbir aytib kiradi va salomdan keyin qolgan takbirlarini yetkazib oladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 28-bet"
  ),
  Question(
    id = 108,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Yurib ketayotgan ulov (ot, eshak, mashina) ustida farz namozini o'qish uzrsiz joizmi?",
    options = listOf(
      "Ha, har doim joiz",
      "Yo'q, uzrsiz joiz emas, faqat shahar tashqarisida nafl namoz o'qish joiz",
      "Faqat peshin joiz",
      "Faqat bomdod joiz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويتنفل راكبا موميا خارج المصر الى غير القبلة مع قدرة على قيامه». Ulovda shahar tashqarisida faqat nafl namozini imo bilan o'qish mumkin, farz namozi esa yerga tushib o'qilishi shart.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 21-bet"
  ),
  Question(
    id = 109,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Qazoga qolgan namozlarni jamoat bilan o'qisa bo'ladimi?",
    options = listOf(
      "Yo'q, qazo faqat yakka o'qiladi",
      "Ha, agar imom va muqtadiyning qazo namozi bir xil bo'lsa (masalan kechagi bomdod), azon va iqomat aytib jamoat bo'lib o'qish joiz",
      "Faqat masjidda joiz",
      "Faqat juma kuni joiz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويقضى الفوائت ويسن الاذان والاقامة للاولى...». Bir xil qazo namozi bo'lsa jamoat bilan o'qish sunnatga muvofiqdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 12-bet"
  ),
  Question(
    id = 110,
    chapterId = "namoz_3",
    chapterTitle = "Namoz: Hayit va Janoza",
    questionText = "Qabrni g'isht yoki pishiq yog'och bilan bekitishning hukmi nima?",
    options = listOf(
      "Vojib",
      "Makruh (hom g'isht va qamish mustahabdir)",
      "Sunnat",
      "Farz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويكره الآجر والخشب». Pishiq g'isht va yog'och ishlatish makruh, hom g'isht va qamish qo'yish afzaldir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 29-bet"
  ),

  // ZAKOT (111 - 135)
  Question(
    id = 111,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Zakot kimlarga farz hisoblanadi?",
    options = listOf(
      "Har bir insonga, hatto bolalar va majnunlarga ham",
      "Hur, musulmon, oqil, balog'atga yetgan, o'z hojatidan ortiq to'liq nisob miqdoridagi molga ega bo'lgan va ustidan bir yil o'tgan kishiga",
      "Faqat qariyalar va savdogarlarga",
      "Faqat davlat amaldorlariga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «لا تجب الا على حر مسلم مكلف مالك ملكا تاما لنصاب فاضل عن حاجته الاصلية وعن دين مطالب من عبد فلا تجب... وحول».",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 30-bet"
  ),
  Question(
    id = 112,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Tuya soni 5 tadan 24 tagacha bo'lganda har 5 ta tuya uchun nima beriladi?",
    options = listOf(
      "Bitta tuya",
      "Bitta qo'y (shoh)",
      "Bitta buzoq",
      "Pul berilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويجب في كل خمس من الابل شاة ثم في خمس وعشرين بنت مخاض...». Har 5 ta tuyaga bitta qo'y vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 31-bet"
  ),
  Question(
    id = 113,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "25 ta tuyadan 35 ta tuyagacha zakotga nima beriladi?",
    options = listOf(
      "5 ta qo'y",
      "Binti maxoz (bir yoshdan oshgan urg'ochi tuya)",
      "Binti labun",
      "Hiqqa"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي خمس وعشرين بنت مخاض». 25 tuyadan boshlab bitta 1 yoshli binti maxoz beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 31-bet"
  ),
  Question(
    id = 114,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "36 ta tuyadan 45 ta tuyagacha zakotga nima beriladi?",
    options = listOf(
      "Binti labun (ikki yoshga to'lgan urg'ochi tuya)",
      "Binti maxoz",
      "Jaza'a",
      "Qo'y"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وفي ست وثلاثين بنت لبون». 36 tuyadan 2 yoshli binti labun vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 31-bet"
  ),
  Question(
    id = 115,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Qoramolning eng birinchi nisobi nechta va unga nima beriladi?",
    options = listOf(
      "10 ta qoramol — 1 qo'y",
      "30 ta qoramol — bir yoshli buzoq (tabi' yoki tabi'a)",
      "40 ta qoramol — 2 buzoq",
      "5 ta qoramol"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي ثلاثين بقرا تبيع او تبيعة وفي اربعين مسن او مسنة». 30 ta qoramolga bir yoshli tabi', 40 tasiga 2 yoshli musinna beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 31-bet"
  ),
  Question(
    id = 116,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Qo'y va echkining birinchi nisobi nechta?",
    options = listOf(
      "20 ta",
      "40 ta (40 tadan 120 tagacha 1 ta qo'y beriladi)",
      "100 ta",
      "10 ta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي اربعين شاة او معزا شاة وفي مائة وعشرين شاتان...». 40 tadan 120 tagacha 1 qo'y beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 31-bet"
  ),
  Question(
    id = 117,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Kumushning nisobi qancha va undan qancha zakot chiqariladi?",
    options = listOf(
      "100 dirham — 10 dirham",
      "200 dirham (taxminan 595 g) — 5 dirham (2.5% yoki 1/40)",
      "50 dirham — 1 dirham",
      "1000 dirham — 50 dirham"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ونصاب الفضة مائتا درهم... فيجب ربع العشر». 200 dirhamdan 1/40 qismi (5 dirham) chiqariladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 32-bet"
  ),
  Question(
    id = 118,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Oltinning nisobi qancha?",
    options = listOf(
      "10 misqol",
      "20 misqol (taxminan 85 g) — undan yarim misqol (2.5%) zakot beriladi",
      "50 misqol",
      "100 misqol"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ونصاب الذهب عشرون مثقالا... فيجب ربع العشر وهو نصف مثقال». Oltin nisobi 20 misqol bo'lib, zakoti 0.5 misqoldir.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 32-bet"
  ),
  Question(
    id = 119,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Tijorat mollarining zakoti qanday hisoblanadi?",
    options = listOf(
      "Donasi sanaladi",
      "Yil oxirida qiymati oltin yoki kumush nisobiga yetishi bilan baholanib, 2.5% chiqariladi",
      "Tijorat moliga zakot yo'q",
      "Faqat 10% beriladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والعروض للتجارة يقوم اذا بلغ قيمته نصابا من احدهما انفع للفقير». Tijorat mollari faqirlarga manfaatliroq bo'lgan tilla yoki kumush qiymati bilan baholanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 32-bet"
  ),
  Question(
    id = 120,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Yomg'ir suvi bilan sug'orilgan yer hosilidan qancha ushur beriladi?",
    options = listOf(
      "Yigirmadan biri (5%)",
      "O'ndan biri (10% yoki ushur)",
      "Yarmi (50%)",
      "Hech narsa berilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفيما سقت السماء والعيون العشر وفيما سقي بغرب او دالية نصف العشر». Osmon (yomg'ir) suvi sug'organ yerga to'liq 1/10 (ushur) beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 34-bet"
  ),
  Question(
    id = 121,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Katta xarajat, charxpalak yoki quduq orqali sug'orilgan ekin hosilidan qancha beriladi?",
    options = listOf(
      "O'ndan bir (10%)",
      "Yigirmadan bir (5% yoki nisfi ushur)",
      "Zakot berilmaydi",
      "Uchdan bir"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفيما سقي بغرب او دالية نصف العشر». Katta xarajatli vositalar bilan sug'orilganda 1/20 (nisfi ushur) beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 34-bet"
  ),
  Question(
    id = 122,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Qadimiy ko'milgan dafina (xazina/kanz) topilsa, undan qancha qismi davlat/baytulmolga beriladi?",
    options = listOf(
      "O'ndan bir",
      "Beshdan bir (xumus / 20%)",
      "Hammasi olinadi",
      "Hech narsa olinmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وما فيه سمة الكفر خمس وباقيه للواجد». Kofirlik belgisi bor dafinadan beshdan bir (xumus) olinadi, qolgani topganga tegishli bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 33-bet"
  ),
  Question(
    id = 123,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Zakotni kimlarga berish joiz emas?",
    options = listOf(
      "Miskin va faqirlarga",
      "O'zining ota-onasiga, bobo-momasiga, o'z farzandlari va nabiralariga, er-xotinga hamda boy kishiga",
      "Qarzdorlarga",
      "Musofirlarga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «لا الى من بينهما ولاد او زوجية ومملوكه وغني وبني هاشم ومواليهم...». Ota-ona, bola-chaqa, er-xotin va boylarga zakot berish joiz emas.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 35-bet"
  ),
  Question(
    id = 124,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Fitr sadaqasi (Sadaqatul fitr) qachon vojib bo'ladi?",
    options = listOf(
      "Ramazon hayiti kuni tong (fajr) otishi bilan",
      "Ramazonning 1-kunida",
      "Qurbon hayitida",
      "Faqat hajda"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وتجب بطلوع فجر الفطر». Fitr sadaqasi Hayit kuni tong otishi bilan vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 36-bet"
  ),
  Question(
    id = 125,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Bug'doydan fitr sadaqasi qancha miqdorda beriladi?",
    options = listOf(
      "Bir so' (taxminan 4 kg)",
      "Yarim so' (nisfu so' — taxminan 2 kg bug'doy yoki un)",
      "Bir qop",
      "10 kg"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الفطرة من بر وماء نصف صاع ومن تمر او شعير صاع». Bug'doydan yarim so', arpa va xurmodan bir to'liq so' beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 36-bet"
  ),

  // RO'ZA (126 - 135)
  Question(
    id = 126,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Shar'iy ro'zaning ta'rifi nima?",
    options = listOf(
      "Faqat go'sht yemaslik",
      "Niyat bilan tong otganidan to quyosh botguncha yeyish, ichish va jinsiy yaqinlikdan tiyilish",
      "Kun bo'yi jim turish",
      "Faqat suv ichib yurish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «هو ترك الاكل والشرب والوطء من الصبح الى المغرب مع النية». Niyat bilan subhdan shomgacha yeyish, ichish va yaqinlikni tark qilishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 36-bet"
  ),
  Question(
    id = 127,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ramazon ro'zasining niyat vaqti qachongacha davom etadi?",
    options = listOf(
      "Faqat shomgacha",
      "Kechadan boshlab to ertasi kuni nisfun-nahori shar'iygacha (katta choshgoh vaqtigacha)",
      "Faqat tong otguncha",
      "Faqat quyosh chiqquncha"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويصح اداء رمضان بنية قبل نصف النهار الشرعي». Ramazon ro'zasiga nisfun-nahorgacha niyat qilish joizdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 36-bet"
  ),
  Question(
    id = 128,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ramazon oyi hilolini ko'rishda havo bulutli bo'lsa bitta adolatli kishining guvohligi qabul qilinadimi?",
    options = listOf(
      "Yo'q, kamida 100 kishi kerak",
      "Ha, ro'za tutish uchun bitta adolatli musulmon (erkak yoki ayol)ning guvohligi kifoya qiladi",
      "Faqat qozining o'zi ko'rishi kerak",
      "Qabul qilinmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقبل خبر عدل ولو قنا او امرأة للصوم مع غيم». Havo bulutli bo'lsa ro'za boshlash uchun bitta adolatli kishi (hatto ayol bo'lsa ham) guvohligi qabul qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 37-bet"
  ),
  Question(
    id = 129,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ramazon ro'zasini qasddan yeb, ichib yoki jimo' qilib buzgan kishiga nima vojib bo'ladi?",
    options = listOf(
      "Faqat bir kun qazo",
      "Qazo va kafforat ikkalasi ham vojib bo'ladi",
      "Faqat istig'for aytadi",
      "Hech narsa vojib bo'lmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «من جامع او جوامع عمدا او اكل او شرب غذاء او دواء عمدا قضى وكفر كالمظاهر». Qasddan yeb-ichsa yoki yaqinlik qilsa ham qazo, ham kafforat lozim bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 37-bet"
  ),
  Question(
    id = 130,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ro'zaning kafforati qanday tartibda ado etiladi?",
    options = listOf(
      "Bir qul ozod qilish; topa olmasa ketma-ket 2 oy (60 kun) ro'za tutish; bunga ham ojiz bo'lsa 60 nafar miskinni to'ydirish",
      "Faqat 10 kun ro'za tutish",
      "10 ta miskinga kiyim berish",
      "Faqat sadaqa berish"
    ),
    correctIndex = 0,
    explanation = "Matnda zihor kafforati kabi bayon qilingan: qul ozod qilish, 2 oy ketma-ket ro'za tutish yoki 60 miskinga taom berish.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 37-bet"
  ),
  Question(
    id = 131,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ro'zador kishi unutib biror narsa yesa yoki ichsa ro'zasi nima bo'ladi?",
    options = listOf(
      "Ro'zasi buziladi va qazo tutadi",
      "Ro'zasi mutlaqo buzilmaydi, esiga tushgach darhol to'xtab ro'zasini davom ettiradi",
      "Kafforat vojib bo'ladi",
      "Yarim kun hisoblanadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «لا ان غلبه او افطر ناسيا». Unutib yesa yoki ichsa ro'zasi buzilmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 37-bet"
  ),
  Question(
    id = 132,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Kishi o'z xohishisiz beixtiyor qussa (qayt qilsa) ro'zasi buziladimi?",
    options = listOf(
      "Ha, har qanday holatda buziladi",
      "Yo'q, agar o'z xohishisiz qussa, og'iz to'la bo'lsa ham buzilmaydi; faqat qasddan og'iz to'la qussa buziladi",
      "Faqat kafforat vojib bo'ladi",
      "Faqat tahorati buziladi, ro'za emas"
    ),
    correctIndex = 1,
    explanation = "Matnda: «او قاء ملأ الفم لا ان غلبه او استقاء اقل منه». Beixtiyor kelsa buzmaydi, qasddan og'iz to'ldirib qussa qazo lozim bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 37-bet"
  ),
  Question(
    id = 133,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Qarilik yoki tuzalmaydigan kasallik sababli ro'za tutishga ojiz bo'lgan shayxi foniy nima qiladi?",
    options = listOf(
      "Hech narsa qilmaydi",
      "Har bir kun uchun fitr sadaqasi miqdorida fidya beradi",
      "Bolalari uning o'rniga ro'za tutadi",
      "Faqat qazo qiladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وشيخ فان عجز عن الصوم افطر واطعم لكل يوم مسكينا كالفطرة». Ro'zaga qodir bo'lmagan qariya har kun uchun bir miskinga fidya to'laydi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 38-bet"
  ),
  Question(
    id = 134,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Qaysi kunlarda ro'za tutish man etilgan (harom/tahrimiy makruh)?",
    options = listOf(
      "Faqat Juma kunlari",
      "Ramazon hayiti kuni va Qurbon hayitining to'rt kuni (tashriq kunlari)",
      "Dushanba va payshanba kunlari",
      "Faqat oylarning o'rtasida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «الا في الايام المنهية اي يوم الفطر والاضحى مع ثلاثة بعده». Ikki hayit va tashriq kunlarida ro'za tutish man etilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 38-bet"
  ),
  Question(
    id = 135,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "E'tikofning eng oz vaqti va uning turlari haqida nima deyilgan?",
    options = listOf(
      "Eng ozi bir oy",
      "Vojib (nazr qilingan), sunnati muakkada (Ramazonning oxirgi 10 kunligi) va mustahab; nafl e'tikof ozgina vaqt bo'lsa ham durust bo'ladi",
      "Faqat hajda bo'ladi",
      "Faqat uyda bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الاعتكاف سنة مؤكدة وهو لبث صائم في مسجد جماعة بنية... والمرأة تعتكف في بيتها».",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 39-bet"
  ),

  // HAJ (136 - 160)
  Question(
    id = 136,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Haj ibodati qachon va kimga farz bo'ladi?",
    options = listOf(
      "Har yili barcha musulmonlarga",
      "Hur, musulmon, mukallaf, sog'lom, yo'li xavfsiz va oilasi ta'minotidan ortiqcha safar xarajatiga (zod va rohila) ega bo'lgan kishiga umrida bir marta",
      "Faqat Madinada yashaganlarga",
      "Faqat davlat rahbarlariga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فرض على حر مسلم مكلف صحيح بصير له زاد وراحلة فضلا عما لابد منه وعن نفقة عياله... في العمر مرة».",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 40-bet"
  ),
  Question(
    id = 137,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ayol kishi hajga borishi uchun qo'shimcha qanday shart talab qilinadi?",
    options = listOf(
      "Hech qanday shart yo'q",
      "Eri yoki mahrami (nikohi harom bo'lgan yaqini) hamroh bo'lishi va idda saqlayotgan bo'lmasligi",
      "Faqat yoshi 60 dan oshgan bo'lishi",
      "Faqat farzandlari bilan borishi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وللمرأة ان كان بينهما وبين مكة مسيرة سفر محرم او زوج...». Ayol kishiga safari bo'lsa mahram yoki er shart qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 40-bet"
  ),
  Question(
    id = 138,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Madina ahlining miqoti qayer?",
    options = listOf(
      "Zulhulayfa (ذو الحليفة)",
      "Juhfa",
      "Yalamlam",
      "Zotu Irq"
    ),
    correctIndex = 0,
    explanation = "Matnda: «وميقات المدني ذو الحليفة والشامي جحفة والنجدي قرن والعراقي ذات عرق واليمنى يلملم». Madina ahliki Zulhulayfadir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 40-bet"
  ),
  Question(
    id = 139,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Hajning asosiy ikki farz rukni qaysilar?",
    options = listOf(
      "Tosh otish va qurbonlik qilish",
      "Arofatda turish (Vuqufi Arofat) va Ziyorat tavofi (Tavofuz ziyorat)",
      "Sa'y qilish va soch oldirish",
      "Madinaga borish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفرضه الاحرام والوقوف بعرفة وطواف الزيارة وواجبه وقوف جمع والسعي...». Hajning farz ruknlari ehrom, Arofatda turish va ziyorat tavofidir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 40-bet"
  ),
  Question(
    id = 140,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi erkak kishiga nimalar taqiqlanadi?",
    options = listOf(
      "Faqat go'sht yeyish",
      "Tikilgan kiyim kiyish, bosh va yuzni yopish, xushbo'ylik surtish, tirnoq va soch olish, ov qilish va yaqinlik qilish",
      "Suv ichish",
      "Gaplashish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فيتقى الرفث والفسوق والجدال وقتل صيد البر... وقلم الظفر وستر الوجه والرأس... ولبس مخيط». Tikilgan kiyim, boshni yopish, xushbo'ylik, tirnoq olish va h.k. man etiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 41-bet"
  ),
  Question(
    id = 141,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Tavof paytida dastlabki uch aylanada tez va yelkalarni silkitib yurish nima deb ataladi?",
    options = listOf(
      "Iztibo'",
      "Raml (رمل)",
      "Sa'y",
      "Ihsor"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يرمل في الثلاثة الاول... ومشى في الاربعة». Dastlabki uch aylanada raml qilish (tez, dadil yurish) sunnatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 42-bet"
  ),
  Question(
    id = 142,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ridoni o'ng qo'ltiq ostidan o'tkazib, chap yelka ustiga tashlash nima deb ataladi?",
    options = listOf(
      "Raml",
      "Iztibo' (مضطبعا)",
      "Tahallul",
      "Talbiya"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مضطبعا وهو جاعل رداءه تحت ابطه الايمن وملقيا طرفيه على كتفه الايسر». O'ng yelkani ochib qo'yish iztibo' deyiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 42-bet"
  ),
  Question(
    id = 143,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Safa va Marva orasida necha marta sa'y qilinadi va qayerdan boshlanadi?",
    options = listOf(
      "Marvadan boshlanib 5 marta",
      "Safodan boshlanib Marvagacha 7 marta (Safodan Marvaga bir, Marvadan Safoga bir hisoblanadi)",
      "10 marta",
      "3 marta"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصعد الصفا... ثم سعى الى المروة... فصار سبعا». Safodan boshlab Marvagacha jami 7 shavt sa'y qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 42-bet"
  ),
  Question(
    id = 144,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Arofatda turish vaqti qachon boshlanadi?",
    options = listOf(
      "Arafa kuni quyosh chiqqanda",
      "Arafa kuni (9-zulhijja) quyosh zavolga og'ganidan to Hayit kuni (10-zulhijja) tong otguncha",
      "Faqat hayit kuni",
      "Faqat kechasi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويكفي حضور ساعة من زوال عرفة الى فجر يوم النحر». Arafa kuni zavoldan to qurbonlik kuni fajrigacha bo'lgan vaqtda ozgina hozir bo'lish bilan ham farz ado bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 43-bet"
  ),
  Question(
    id = 145,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Muzdalifada qaysi ikki namoz jamlab o'qiladi?",
    options = listOf(
      "Peshin va asr",
      "Shom va xufton namozlari xufton vaqtida bir azon va bir iqomat bilan",
      "Bomdod va peshin",
      "Namoz jamlanmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «صلى العشاءين في وقت العشاء باذان واقامة». Muzdalifada shom va xufton xufton vaqtida jamlab o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 43-bet"
  ),
  Question(
    id = 146,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Hayitning birinchi kuni Minoda qaysi tosh otiladi?",
    options = listOf(
      "Uchala tosh ham",
      "Faqat katta tosh — Jamratul Aqabaga 7 ta tosh otiladi",
      "Hech qanday tosh otilmaydi",
      "Faqat kichik tosh"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ورمى جمرة العقبة من بطن الوادي سبعا كذفا وكبر بكل وقطع التلبية باولها». 10-zulhijja kuni faqat Jamratul Aqabaga 7 tosh otiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 43-bet"
  ),
  Question(
    id = 147,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Talbiya («Labbaykallohumma labbayk...») aytish qachon to'xtatiladi?",
    options = listOf(
      "Ehromga kirgan zahoti",
      "Jamratul Aqabaga birinchi toshni otish bilan",
      "Makkadan qaytganda",
      "Arofatga yetganda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقطع التلبية باولها». Jamratul Aqabaga otiladigan birinchi tosh bilan talbiya to'xtatiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 43-bet"
  ),
  Question(
    id = 148,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Hojilar uchun eng afzal haj turi qaysi hisoblanadi (Hanafiy mazhabida)?",
    options = listOf(
      "Hajji Ifrod",
      "Hajji Qiron (Umra va Hajni bitta ehromda jamlash)",
      "Hajji Tamattu'",
      "Faqat Umra"
    ),
    correctIndex = 1,
    explanation = "Matnda: «القران افضل مطلقا وهو ان يهل بحج وعمرة من ميقات معا... والتمتع افضل من الافراد». Hanafiy mazhabida Qiron eng afzalidir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 45-bet"
  ),
  Question(
    id = 149,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Qiron yoki Tamattu' qilgan kishi qurbonlik qilishga puli yoki qurbi yetmasa nima qiladi?",
    options = listOf(
      "Haji bekor bo'ladi",
      "10 kun ro'za tutadi: 3 kunini haj mavsumida (Arafadan oldin), 7 kunini esa uyiga qaytgach tutadi",
      "Hech narsa qilmaydi",
      "Faqat istig'for aytadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان عجز صام ثلاثة ايام آخرها عرفة وسبعة بعد حجه». Qurbonlikka qodir bo'lmasa 3 kun hajda, 7 kun qaytgach ro'za tutadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 45-bet"
  ),
  Question(
    id = 150,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi kishi to'liq bir a'zosiga xushbo'ylik surtsa yoki butun bir kun tikilgan kiyim kiysa unga nima lozim bo'ladi?",
    options = listOf(
      "Bir hovuch bug'doy berish",
      "Dam (bitta qo'y so'yish)",
      "Faqat tavba qilish",
      "Hajni qaytadan boshlash"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ان طيب محرم عضوا او ادهن او لبس مخيطا... يوما فعليه دم». To'liq bir kun tikilgan kiyim kiysa yoki butun a'zoga xushbo'ylik surtsa jonliq so'yish (dam) vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 45-bet"
  ),
  Question(
    id = 151,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi kishi Arofatda turishdan oldin jinsiy yaqinlik qilib qo'ysa nima bo'ladi?",
    options = listOf(
      "Hech narsa qilmaydi",
      "Haji butunlay buziladi (fosid bo'ladi), lekin amallarni oxirigacha davom ettiradi, qo'y so'yadi va kelgusi yili qazosini o'taydi",
      "Faqat ro'za tutadi",
      "Faqat pul to'laydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ووطؤه قبل وقوف عرفة افسد حجه ومضى وذبح وقضى». Arofatdan oldin yaqinlik qilsa haj fosiq bo'ladi, amallarni tugatib, jonliq so'yadi va kelasi yili qazo qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 46-bet"
  ),
  Question(
    id = 152,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Haram hududining daraxtlari yoki ko'katlarini kesish mumkinmi?",
    options = listOf(
      "Ha, xohlagancha kesish mumkin",
      "Yo'q, haram o't-o'lanlari va daraxtlarini kesish man etilgan, faqat izxir o'ti mustasno",
      "Faqat mevali daraxtlar kesiladi",
      "Faqat tunda mumkin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يرعى الحشيش ولا يقطع الا الاذخر». Haram hududidagi ko'kat va daraxtlar kesilmaydi, faqat izxir o'ti mustasno.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 47-bet"
  ),
  Question(
    id = 153,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Tashqaridan kelgan hojilar uchun Makkadan chiqib ketish oldidan qilinadigan oxirgi tavof nima deb ataladi?",
    options = listOf(
      "Tavofi Qudum",
      "Tavofi Sadr yoki Tavofi Vado' (vidolashuv tavofi)",
      "Tavofi Ziyorat",
      "Umra tavofi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «طاف للصدر بلا رمل وسعي». Ofoqiy (tashqaridan kelgan) kishilar uchun Tavofi Vado' (Sadr) vojibdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 44-bet"
  ),
  Question(
    id = 154,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Dushman yoki og'ir kasallik sababli yo'lda to'silib, hajni davom ettira olmagan kishi nima deb ataladi?",
    options = listOf(
      "Masbuq",
      "Muhsar (محصر)",
      "Murtad",
      "Musofir"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب الاحصار: فصل ان احصر المحرم بعدو او مرض...». Haj yoki umradan to'silgan kishi muhsar deyiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 47-bet"
  ),
  Question(
    id = 155,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Muhsar bo'lgan kishi ehromdan qanday chiqadi?",
    options = listOf(
      "Shunchaki kiyimini kiyib ketaveradi",
      "Haramga yetkazib so'yish uchun jonliq (hady) yuboradi va u so'yilgach soch oldirib ehromdan chiqadi",
      "Faqat namoz o'qiydi",
      "Hech qachon ehromdan chiqa olmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «بعث المفرد دما والقارن دمين وعين يوما يذبح فيه... يحل به». Haramga jonliq yuborib, u so'yilgach ehromdan chiqadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 48-bet"
  ),
  Question(
    id = 156,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi kishi chivin, burgacha, kana kabi zararkunandalarni o'ldirsa kafforat to'laydimi?",
    options = listOf(
      "Ha, qo'y so'yadi",
      "Yo'q, chivin, burga, kana, qora ilon, chayon, qopag'on it kabi zararlilarni o'ldirishda hech qanday jarima yo'q",
      "Faqat ro'za tutadi",
      "Haji buziladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا شيئ بقتل غراب وحدأة وعقرب وحية وفأرة وكلب عقور وبعوض وبرغوث...». Bularni o'ldirgan kishiga hech qanday jazo yoki jarima yo'q.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 47-bet"
  ),
  Question(
    id = 157,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Haj oylari (ashhurul haj) qaysilar?",
    options = listOf(
      "Ramazon va Rajab",
      "Shavvol, Zulqa'da va Zulhijja oyining dastlabki o'n kuni",
      "Faqat Zulhijja oyi to'liq",
      "Muharram va Safar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واشهره شوال وذو القعدة وعشر ذي الحجة». Shavvol, Zulqa'da va Zulhijjaning dastlabki 10 kuni haj oylaridir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 40-bet"
  ),
  Question(
    id = 158,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi kishi bit (qamla) o'ldirsa nima bo'ladi?",
    options = listOf(
      "Hech narsa bo'lmaydi",
      "Sadaqa berishi lozim bo'ladi",
      "Haji bekor bo'ladi",
      "Tuya so'yadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وبقتل قملة او جرادة صدقة وان قلت». Bit yoki chigirtka o'ldirilsa ozgina bo'lsa ham sadaqa beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 47-bet"
  ),
  Question(
    id = 159,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Tavofi Ziyoratni hayit kunlaridan (10, 11, 12-zulhijja) kechiktirib yuborsa nima bo'ladi?",
    options = listOf(
      "Haj bekor bo'ladi",
      "Abu Hanifa (r.a.) nazdida kechiktirgani uchun bitta jonliq (qon/dam) so'yish vojib bo'ladi",
      "Hech qanday zarari yo'q",
      "Faqat nafl bo'lib qoladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واول وقته بعد فجر يوم النحر وهو فيه افضل فان اخر عنها كره ويجب دم». Hayit kunlaridan kechiktirsa makruh bo'ladi va qon (jonliq) vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 44-bet"
  ),
  Question(
    id = 160,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Hojilar Arafa kuni Minodan Arafotga qachon yo'l oladilar?",
    options = listOf(
      "Arafa kuni quyosh botganda",
      "Arafa kuni (9-zulhijja) quyosh chiqqandan keyin",
      "8-zulhijja kechasi",
      "Hayit kuni ertalab"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويخرج غداة التاسع بعرفات... ومكث بها الى فجر عرفة ثم منها الى عرفات». 9-kuni ertalab quyosh chiqqach Minodan Arafotga chiqiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 43-bet"
  )
)
