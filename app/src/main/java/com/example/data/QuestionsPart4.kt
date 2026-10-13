package com.example.data

import com.example.model.Question
import com.example.model.QuestionDifficulty

val questionsPart4: List<Question> = listOf(
  // SAVDO-SOTIQ VA RIBO (201 - 235)
  Question(
    id = 201,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Hanafiy fiqhida bay' (savdo-sotiq)ning shar'iy ta'rifi nima?",
    options = listOf(
      "Bir tomonlama mol berish",
      "Molni molga o'zaro rozilik bilan, o'tgan zamon lafzlari orqali ijob va qabul bilan almashtirish",
      "Faqat naqd pulga mol sotib olish",
      "Faqat qarz berish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب البيع: هو مبادلة مال بمال بتراض ينعقد بايجاب وقبول بلفظي ماض...». Molni molga o'zaro rozilik bilan almashtirish savdo-sotiqdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 89-bet"
  ),
  Question(
    id = 202,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Xiyor ash-shart (savdoda o'ylab ko'rish sharti) eng ko'pi bilan necha kunga berilishi joiz?",
    options = listOf(
      "1 kun",
      "Uch kun (salosata ayyam) yoki undan oz",
      "Bir oy",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل صح خيار الشرط لكل منهما ولهما ثلاثة ايام او اقل لا اكثر». Shart ixtiyori ko'pi bilan 3 kunga joiz bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 90-bet"
  ),
  Question(
    id = 203,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Ko'rmasdan turib biror molni sotib olgan xaridorning haqqi nima deb ataladi?",
    options = listOf(
      "Xiyor ash-shart",
      "Xiyor ar-ru'ya (ko'rish ixtiyori)",
      "Xiyor al-ayb",
      "Xiyor at-ta'yin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل صح شراء ما لم يره وللمشتريه الخيار عندها...». Molni ko'rmay sotib olgan xaridor uni ko'rgan paytida olish yoki qaytarish ixtiyoriga ega bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 91-bet"
  ),
  Question(
    id = 204,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Sotuvchi ko'rmagan narsasini sotsa, unda ko'rish ixtiyori bo'ladimi?",
    options = listOf(
      "Ha, sotuvchida ham bo'ladi",
      "Yo'q, sotuvchida ko'rish ixtiyori bo'lmaydi, faqat xaridorda bo'ladi",
      "Ikkalasida ham bo'lmaydi",
      "Qozining ixtiyorida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «لا لبائعه». Sotuvchida ko'rish ixtiyori bo'lmaydi, faqat xaridorga beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 91-bet"
  ),
  Question(
    id = 205,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Molda yashirin ayb chiqsa xaridor nima qilishga haqli (Xiyor al-ayb)?",
    options = listOf(
      "Faqat narxini tushirib qoldirishga",
      "Molni to'liq bahosiga qaytarib berishga yoki bor holida rozi bo'lib olishga (lekin o'zboshimchalik bilan narxini kamaytirib ololmaydi)",
      "Molni sindirib tashlashga",
      "Qaytara olmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل ولمشتر وجد بمشتريه عيبا نقص ثمنه عند التجار رده او اخذه بثمنه...». Ayb chiqsa xaridor to'liq puliga qaytaradi yoki o'sha narxida oladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 92-bet"
  ),
  Question(
    id = 206,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Shar'an mol hisoblanmaydigan narsalarni (masalan o'limtik, qon, hur inson) sotish qanday savdo?",
    options = listOf(
      "Fosid savdo",
      "Botil savdo (asli ham, sifati ham durust emas, hech qanday mulk keltirmaydi)",
      "Makruh savdo",
      "Sahih savdo"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل بطل بيع ما ليس بمال كالميتة والدم والحر وانباعه...». Mol bo'lmagan narsalar savdosi botildir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 93-bet"
  ),
  Question(
    id = 207,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Asli shar'an durust bo'lib, ammo biror sharti yoki vasfida buzilish bo'lgan savdo nima deyiladi?",
    options = listOf(
      "Bay'i botil",
      "Bay'i fosid",
      "Bay'i murobaha",
      "Bay'i salam"
    ),
    correctIndex = 1,
    explanation = "Bay'i fosid — aslan mashru', lekin vasfan g'ayri mashru' bo'lgan savdo bo'lib, mol qo'lga tekkanda xabis mulk keltirsa-da, uni buzish (fasx qilish) vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 93-94-bet"
  ),
  Question(
    id = 208,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Iqola (الاقالة) nima?",
    options = listOf(
      "Molga qo'shimcha narx qo'yish",
      "Savdodan keyin har ikki tomonning o'zaro roziligi bilan bitimni bekor qilib, mol va pulni o'z egalariga qaytarish",
      "Qarzni kechib yuborish",
      "Garovga qo'yish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الاقالة فسخ في حق المتعاقدين فتبطل بعد هلاك المبيعة...». Iqola bu taraflar roziligi bilan tuzilgan savdoni bekor qilishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 95-bet"
  ),
  Question(
    id = 209,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Ribo (sudxo'rlik)ning yuzaga kelish sababi (illati) Hanafiy mazhabida nima?",
    options = listOf(
      "Faqat naqd pul bo'lishi",
      "O'lchov (vazn yoki hajm/kayl) bilan jinsning birligi",
      "Faqat oziq-ovqat bo'lishi",
      "Faqat foiz hisoblanishi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وعلته القدر اي الكيل او الوزن مع الجنس... فان وجد الوصفان حرم الفضل والنساء...». Ribo illati o'lchov (kayl yoki vazn) va jins birligidir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 95-96-bet"
  ),
  Question(
    id = 210,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Bug'doyni bug'doyga almashtirganda nima shart qilinadi?",
    options = listOf(
      "Biri ko'proq bo'lishi kerak",
      "Tengma-teng (mislam bimislin) va qo'lma-qo'l (naqd) bo'lishi shart, ozgina ortiqchalik ham ribodir",
      "Nasiyaga bo'lishi kerak",
      "Farqi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يجوز الكيلي بمثله الا متساويا كيلا والوزني وزنا...». Kayliy va vazniy mollar o'z jinsiga tengma-teng va naqd ayirboshlanishi shart.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 96-bet"
  ),
  Question(
    id = 211,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Bay'us-salam (zakalat/oldindan to'lov savdosi) qanday bo'ladi?",
    options = listOf(
      "Puli ham, moli ham keyin beriladi",
      "Mablag'i (ra'sul mol) savdo majlisida naqd to'lanadi, aniq sifatlari belgilangan mol esa ma'lum muddatdan so'ng yetkazib beriladi",
      "Faqat qarz berish",
      "Noma'lum molni sotish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب السلم: السلم فيما يعلم قدره ووصفه كالمكيل والموزون مثمنا... وقبض رأس المال قبل الافتراق شرط». Ra'sul mol majlisda naqd to'lanishi shartdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 98-bet"
  ),
  Question(
    id = 212,
    chapterId = "buyu",
    chapterTitle = "Savdo-sotiq va Ribo kitobi",
    questionText = "Bay'us-sarf (valyuta, oltin-kumush ayirboshlash)da asosiy shart nima?",
    options = listOf(
      "Keyinchalik to'lash",
      "Har ikki tomon savdo majlisidan tarqab ketmasdan oldin mablag'larni qo'lma-qo'l qabz qilishi (taqobuz fil-majlis)",
      "Faqat bir kishi qabz qilishi",
      "Shart yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب الصرف: بيع الثمن بالثمن جنسا بجنس او بغير جنس وشرطه التقابض قبل الافتراق». Ayrilib ketishdan oldin har ikki tomon qo'lma-qo'l qabz qilishi shart.",
    bookReference = "Muxtasarul Viqoya, Kitobul Buyu', 99-bet"
  ),

  // MUOMALA: SHUF'A, TAQSIMOT, HADYA, IJARA, RAHN (213 - 225)
  Question(
    id = 213,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Shuf'a haqqi ketma-ketlikda kimlarga tegishli bo'ladi?",
    options = listOf(
      "Faqat eng boy odamga",
      "Avval sotilgan mulkning bevosita sherigiga (shariyk), so'ngra yo'l yoki ariqdagi sherikka (xalit), so'ngra devordosh qo'shniga (jorul muloziq)",
      "Faqat o'sha mahalladagi qoziga",
      "Begona xaridorga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يثبت للشريك في المبيع ثم للخليط في حق المبيع كالشرب والطريق الخاصين ثم للجار ملاصق...». Shuf'a tartibi: shariyk, xalit va devordosh qo'shnidir.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shuf'a, 99-100-bet"
  ),
  Question(
    id = 214,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Qo'shni o'z yerining sotilganini eshitishi bilan darhol nima qilishi kerak («Talabul muvosaqa»)?",
    options = listOf(
      "Bir oy kutadi",
      "Eshitgan majlisining o'zida shuf'a haqqini talab qilishi va guvohlar huzurida tasdiqlashi shart, aks holda haqqi soqit bo'ladi",
      "Hech narsa demaydi",
      "Eski egasini so'roq qiladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويطلبها في مجلس علمه بالبيع وهو طلب مواثبة ثم يشهد على طلبه...». Xabarni eshitgan zahoti darhol talab qilishi shart.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shuf'a, 100-bet"
  ),
  Question(
    id = 215,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Hadya (hibah) qachon to'liq mulk bo'lib tugallanadi?",
    options = listOf(
      "Faqat til bilan aytganda",
      "Hadya berilgan narsa hadya oluvchining qo'liga topshirilib, qabz qilinganda (tamlik bil-qabd)",
      "Qozi rozi bo'lganda",
      "Bir yil o'tganda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الهبة: هي تمليك عين بلا عوض... وتتم بالقبض». Hadya faqat qabz (qo'lga olish) bilan to'liq bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hiba, 103-bet"
  ),
  Question(
    id = 216,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "O'zining yaqin mahram qarindoshiga (masalan o'g'liga yoki akasiga) hadya bergan kishi hadyasidan qaytishi joizmi?",
    options = listOf(
      "Ha, xohlagan payt qaytarib oladi",
      "Yo'q, mahram qarindoshga berilgan hadyadan qaytish mutlaqo joiz emas",
      "Faqat qozi ruxsati bilan",
      "Yarmini qaytaradi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويمنعه زيادة متصلة وموت احدهما وعوض... وقرابة المحرمية...». Mahramlik qarindoshligi hadyani qaytarib olishga to'siqdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hiba, 104-bet"
  ),
  Question(
    id = 217,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Ijaraning shar'iy ta'rifi nima?",
    options = listOf(
      "Egalikni tekinga berish",
      "Ma'lum bir foyda va manfaatlarni ma'lum haq (ijara haqi) evaziga sotish",
      "Qarz berish",
      "Omonat saqlash"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الاجارة: هي بيع نفع معلوم بعوض كذا دين او عين...». Ma'lum manfaatlarni haq evaziga sotish ijara deyiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ijora, 105-bet"
  ),
  Question(
    id = 218,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Ajiri xos (bir kishiga xoslangan ishchi) qachon o'z haqiga loyiq bo'ladi?",
    options = listOf(
      "Faqat yil oxirida",
      "O'zini o'sha belgilangan muddatda ish beruvchining ixtiyoriga topshirishi bilan (hatto ish bo'lmasa ham)",
      "Faqat ish ko'p bo'lsa",
      "Haq ololmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والاجير الخاص يستحق بتسليم نفسه مدته وان لم يعمل». O'zini topshirgan vaqti uchun ishchi haqqa loyiq bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ijora, 108-bet"
  ),
  Question(
    id = 219,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Rahn (garov) nima?",
    options = listOf(
      "Omonat topshirish",
      "Qarz yoki moliyaviy haq evaziga olinishi mumkin bo'lgan qimmatbaho molni garovga qo'yib ushlab turish",
      "Hadya berish",
      "Savdo qilish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الرهن: هو حبس مال متقوم بحق يمكن اخذه منه كالدين...». Garov bu qarzni undirib olish mumkin bo'lgan molni ushlab turishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobur Rahn, 114-bet"
  ),
  Question(
    id = 220,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Garovdagi mol murtahin (garov oluvchi)ning qo'lida nobud bo'lsa nima bo'ladi?",
    options = listOf(
      "Qarz to'liq qoladi",
      "Garovdagi molning qiymatiga qarab qarz soqit bo'ladi (kamroq qiymat bilan qoplanadi)",
      "Murtahin qamaladi",
      "Hech narsa bo'lmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وضمن باقل من قيمته ومن الدين فلو هلك سقط دينه...». Garovdagi mol nobud bo'lsa qarz o'sha mol qiymati miqdorida soqit bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobur Rahn, 114-bet"
  ),
  Question(
    id = 221,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Kafolat (الـكفالة) nima?",
    options = listOf(
      "Qarzni o'z zimmasiga qo'shish (talab qilishda birovning zimmasiga o'z zimmasini bog'lash)",
      "Hadya berish",
      "Sherikchilik qilish",
      "Qozi bo'lish"
    ),
    correctIndex = 0,
    explanation = "Matnda: «كتاب الكفالة: هي ضم ذمة الى ذمة في المطالبة لا في الدين وهو الاصح». Kafolat talab qilish huquqida bir zimmani boshqa zimmaga qo'shishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Kafolat, 117-bet"
  ),
  Question(
    id = 222,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Havola (الحوالة) nima?",
    options = listOf(
      "Qarzni bir kishining zimmasidan boshqa kishining zimmasiga ko'chirish",
      "Qarzni kechish",
      "Garov olish",
      "Tijorat qilish"
    ),
    correctIndex = 0,
    explanation = "Matnda: «كتاب الحوالة: هي اثبات دين لآخر على آخر مع عدم الدين على المحيل... نقل الدين من ذمة الى ذمة». Qarzni boshqa shaxsga ko'chirish havola deyiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Havola, 120-bet"
  ),
  Question(
    id = 223,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Vakolat (الوكالة) nima?",
    options = listOf(
      "Birovni o'zining tasarrufida o'z o'rniga qo'yish (vakil qilish)",
      "Molni omonat saqlash",
      "Hadyani bekor qilish",
      "Qasam ichish"
    ),
    correctIndex = 0,
    explanation = "Matnda: «كتاب الوكالة: هي تفويض التصرف الى غيره وشرطه ان يملكه الموكل ويعقله الوكيل...». Bir shaxs o'z tasarruf huquqini boshqasiga topshirishi vakolatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vakola, 121-bet"
  ),
  Question(
    id = 224,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Muzoraba (المضاربة) shartnomasi qanday tuziladi?",
    options = listOf(
      "Ikki tomon teng pul qo'shadi",
      "Bir tomondan sarmoya (moliya), ikkinchi tomondan mehnat va ish bo'lib, foyda oldindan belgilangan foizda taqsimlanadi",
      "Faqat qarz beriladi",
      "Foyda faqat sarmoyadorga tegishli bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب المضاربة: هي عقد شركة في الربح بمال من رجل وعمل من آخر...». Muzoraba — bir kishidan mol, boshqasidan mehnat bo'lgan sherikchilikdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Muzoraba, 126-bet"
  ),
  Question(
    id = 225,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Vaqf qilingan mulkni sotish yoki meros qilib olish mumkinmi?",
    options = listOf(
      "Ha, xohlagancha sotish mumkin",
      "Yo'q, vaqf mulki sotilmaydi, hadya qilinmaydi va meros bo'lmaydi, balki Alloh taolo mulki hukmida boqiy qoladi",
      "Faqat bolalari sotishi mumkin",
      "Faqat ijaraga berilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الوقف: هو حبس العين على ملك الواقف والتصدق بالمنفعة... وعند هما هو حبس على ملك الله تعالى فلا يزول ولا يملك ولا يباع ولا يوهب». Vaqf mulki sotilmaydi va hadya qilinmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vaqf, 132-bet"
  ),

  // JINOYAT, HUDUD, QAZO, ZABOYIH VA BOSHQA MASALALAR (226 - 260)
  Question(
    id = 226,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qasddan odam o'ldirishda (Qatlul amd) qanday jazo tayinlanadi?",
    options = listOf(
      "Faqat jarima to'lanadi",
      "Qasos (lozim bo'lsa o'lim jazosi) tayinlanadi, agar valiy kechirsa yoki sulh qilsa qasos soqit bo'ladi",
      "Hech qanday jazo yo'q",
      "Faqat 1 oy qamaladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الجنايات: القتل العمد... يوجب القود...». Qasddan o'ldirish qasosni vojib qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Jinoyat, 170-bet"
  ),
  Question(
    id = 227,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Xato qilib odam o'ldirganda (Qatlul xato) qanday jazo vojib bo'ladi?",
    options = listOf(
      "Qasos olinadi",
      "Qotilning oqilasi (qarindosh-urug'i) zimmasiga to'liq diyat va qotilga kafforat (qul ozod qilish yoki 2 oy ro'za)",
      "Faqat qamoq",
      "Hech narsa yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وفي الخطأ دية مغلظة على العاقلة... والكفارة». Xato o'ldirishda oqilaga diyat va qotilga kafforat lozim bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Jinoyat, 170-bet"
  ),
  Question(
    id = 228,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkak kishining to'liq shar'iy diyati qancha miqdorda belgilanadi?",
    options = listOf(
      "10 ta tuya",
      "100 ta tuya yoki 1000 dinor oltin yoxud 10 000 dirham kumush",
      "50 ta qo'y",
      "500 dinor"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الديات: الدية من الذهب الف دينار ومن الفضة عشرة آلاف درهم ومن الابل مائة...». Diyat 100 tuya, 1000 dinor oltin yoki 10 000 dirham kumushdir.",
    bookReference = "Muxtasarul Viqoya, Kitobud Diyat, 172-bet"
  ),
  Question(
    id = 229,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Ayol kishining diyati erkak kishining diyatiga nisbatan qancha?",
    options = listOf(
      "Erkakniki bilan teng",
      "Erkak kishi diyatining teng yarmi (nisf)",
      "Uchdan bir",
      "To'rtdan bir"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وللمرأة نصف ما للرجل في النفس وما دونها...». Ayol kishining joni va a'zolari diyati erkak kishining yarmiga tengdir.",
    bookReference = "Muxtasarul Viqoya, Kitobud Diyat, 173-bet"
  ),
  Question(
    id = 230,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Muhsan (turmush qurgan ozod musulmon) bo'lgan kishi zino qilsa uning shar'iy haddi nima?",
    options = listOf(
      "100 darra urish",
      "Rajm (toshbo'ron qilib o'ldirish)",
      "Surgan qilish",
      "Faqat jarima"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الحدود: وحد الزنى... وهو للمحصن رجمه في فضاء حتى يموت... ولغير المحصن جلده مائة...». Muhsanga rajm qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hudud, 160-bet"
  ),
  Question(
    id = 231,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Uylanmagan (g'ayri muhsan) hur kishining zino haddi qancha?",
    options = listOf(
      "50 darra",
      "100 darra (kamchi) urish",
      "Rajm",
      "Qamoq"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولغير المحصن جلده مائة بسوط لا ثمرة له...». G'ayri muhsanga 100 darra uriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hudud, 160-bet"
  ),
  Question(
    id = 232,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Pokiza insonga zino tuhmatini qilgan kimsaga (Qazf haddi) necha darra uriladi?",
    options = listOf(
      "40 darra",
      "80 darra (sakson darra) uriladi va guvohligi boshqa qabul qilinmaydi",
      "100 darra",
      "50 darra"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل من قذف محصنا... حده ثمانون سوطا كحد الشرب...». Qazf haddi 80 darradir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hudud, 161-bet"
  ),
  Question(
    id = 233,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Mast qiluvchi ichimlik (xamr) ichgan kishining shar'iy haddi necha darra?",
    options = listOf(
      "40 darra",
      "80 darra (sakson darra)",
      "20 darra",
      "100 darra"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كحد الشرب... ثمانون سوطا». Mastlik haddi 80 darradir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hudud, 161-162-bet"
  ),
  Question(
    id = 234,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "O'g'rilik (Sariqa) haddida qo'l kesilishi uchun o'g'irlangan molning nisobi kamida qancha bo'lishi kerak?",
    options = listOf(
      "1 dirham",
      "10 dirham (asharatu darohim) qiymatida bo'lishi va saqlangan joydan (hirzdan) yashirincha olingan bo'lishi shart",
      "100 dirham",
      "1 dinor"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب السرقة: هي اخذ مكلف خفية قدر عشرة دراهم مضروبة مملوكا محرزا بلا شبهة...». O'g'rilik nisobi 10 dirhamdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Sariqa, 163-bet"
  ),
  Question(
    id = 235,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Birinchi marta o'g'rilik qilgan kishining qaysi a'zosi kesiladi?",
    options = listOf(
      "Chap qo'li",
      "O'ng qo'li bilagidan (zandidan) kesiladi",
      "O'ng oyog'i",
      "Barmoqlari"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يقطع يمين السارق من زند ويحسم... فان عاد ثانيا قطعت رجله اليسرى». Birinchi marta o'ng qo'li zandidan kesiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Sariqa, 164-bet"
  ),
  Question(
    id = 236,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Hayvonni so'yganda qaysi tomir va a'zolari kesilishi lozim?",
    options = listOf(
      "Faqat bitta tomiri",
      "Xalqum (nafas yo'li), mari' (ovqat yo'li) va ikki vadaj (bo'yin tomirlari) — jami to'rttadan kamida uchtasi kesilishi shart",
      "Boshini butunlay uzib tashlash",
      "Faqat terisini tilish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الذبائح: والاختيار ذبح بين الحلق واللبة وعروقه الحلقوم والمرئ والودجان وحل بقطع اي ثلث منها». To'rtta a'zodan uchtasi kesilsa halol bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zaboyih, 137-bet"
  ),
  Question(
    id = 237,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Hayvon so'yuvchi kishi qasddan bismillohni tark qilsa so'yilgan go'shtning hukmi nima?",
    options = listOf(
      "Halol bo'laveradi",
      "Go'shti harom (o'limtik hukmida) bo'ladi; agar unutib tark qilsa halol bo'ladi",
      "Makruh bo'ladi",
      "Faqat qoni harom"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان تارك التسمية عمدا وان نسي صح وحرم ان عطف على اسم الله غيره...». Bismillohni qasddan tark qilsa harom bo'ladi, unutsa kechiriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zaboyih, 137-bet"
  ),
  Question(
    id = 238,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Suvda yashovchi hayvonlardan qaysilari Hanafiy mazhabida halol hisoblanadi?",
    options = listOf(
      "Qisqichbaqa, baqa va timsoh",
      "Faqat baliq turlari (samak) halol, boshqa suv jonivorlari haromdir",
      "Barcha suv hayvonlari mutlaqo halol",
      "Faqat ilonbaliq"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يحل حيوان مائي سوى سمك لم يطف وحل الجراد...». Suv hayvonlaridan faqat o'zi o'lib suzib qolmagan (tofi bo'lmagan) baliq turlari haloldir.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zaboyih, 138-bet"
  ),
  Question(
    id = 239,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qurbonlik (Uzhiya) necha kun davomida so'yilishi mumkin?",
    options = listOf(
      "Faqat 1 kun",
      "Uch kun: Qurbon hayiti kuni va undan keyingi ikki kun (10, 11, 12-zulhijja quyosh botguncha)",
      "7 kun",
      "Bir oy"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الاضحية: واول وقتها بعد صلوة العيد... وآخره قبيل غروب اليوم الثالث». Qurbonlik hayit namozidan to uchinchi kun quyosh botgunigachadir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Uzhiya, 138-139-bet"
  ),
  Question(
    id = 240,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Bitta qoramol yoki tuyaga qurbonlikda necha kishi sherik bo'lishi mumkin?",
    options = listOf(
      "Faqat 1 kishi",
      "Yetti kishigacha (barchasining niyati qurbonlik va ibodat bo'lishi sharti bilan)",
      "O'n kishi",
      "Cheksiz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «شاة من فرد وبقرة او بعير منه الى سبعة...». Qoramol va tuyaga 7 kishigacha sherik bo'lish joiz.",
    bookReference = "Muxtasarul Viqoya, Kitobul Uzhiya, 138-bet"
  ),
  Question(
    id = 241,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qo'y va echki necha yoshdan qurbonlikka yaroqli bo'ladi?",
    options = listOf(
      "6 oylik",
      "Bir yoshga to'lgan bo'lishi kerak (agar 6 oylik qo'zi bir yoshlidek semiz va katta bo'lsa u ham joiz)",
      "2 yosh",
      "3 yosh"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وصح الجذع من الضأن والثني فصاعدا من غيره وهو ابن حول من الضأن والمعز وحولين من البقر وخمس من الابل». Qo'y-echkida 1 yosh, qoramolda 2, tuyada 5 yosh.",
    bookReference = "Muxtasarul Viqoya, Kitobul Uzhiya, 139-bet"
  ),
  Question(
    id = 242,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qurilgan it yoki lochin bilan ov qilinganda ov go'shti qachon halol bo'ladi?",
    options = listOf(
      "Har qanday holatda",
      "O'rgatilgan bo'lsa, bismilloh aytib jo'natilsa, o'lja uchun ov qilsa va o'zi undan yeb qo'ymasa",
      "Faqat tirik tutsa",
      "Har doim harom"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الصيد: يحل صيد كل ذي ناب ومخلب بشرط علمهما وجرحهما وارسال مسلم او كتابي مسميا... ويعلم المعلم بترك اكل الكلب ثلاث مرات...».",
    bookReference = "Muxtasarul Viqoya, Kitobus Sayd, 140-bet"
  ),
  Question(
    id = 243,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Topib olingan bola (Laqit)ning nasabi va xarajati qanday bo'ladi?",
    options = listOf(
      "Qul qilib sotiladi",
      "U hur musulmondir, uni asrash savob, nafaqasi yonidagi molidan, bo'lmasa Baytulmoldan qoplanadi",
      "Tashlab yuboriladi",
      "Faqat topgan odamning qaramog'ida qoladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب اللقيط واللقطة: اللقيط رفعه احب وان خيف هلاكه وجب وهو حر... ونفقته وجنايته في بيت المال...».",
    bookReference = "Muxtasarul Viqoya, Kitobul Laqit, 141-bet"
  ),
  Question(
    id = 244,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Yo'qolgan (daraksiz ketgan) kishi (Mafqud) haqida qanday hukm chiqariladi?",
    options = listOf(
      "Darhol o'lgan deb e'lon qilinadi",
      "Tengqurlari vafot etadigan yoshga (90 yoshga) yetguncha u tirik hukmida bo'ladi, xotini erga tegmaydi, moli taqsimlanmaydi",
      "Moli musodara qilinadi",
      "3 kunda merosi bo'linadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب المفقود: هو غائب لم يدر اثره حي في حق نفسه فلا تنكح عرسه ولا يقسم ماله... الى تسعين سنة...». 90 yoshga yetguncha o'z molida tirik hisoblanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Mafqud, 142-143-bet"
  ),
  Question(
    id = 245,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qozi pora olsa uning hukmi nima?",
    options = listOf(
      "Hukmi o'tadi",
      "Darhol qozilik lavozimidan tushadi (ma'zul bo'ladi) va chiqargan hukmlari botildir",
      "Faqat ogohlantiriladi",
      "Hech narsa bo'lmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب القضاء: ومن اخذه بالرشوة لا يصير قاضيا وقيل ينعزل...». Pora olish qozilikni botil qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Qazo, 143-bet"
  ),
  Question(
    id = 246,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Zino da'vosida necha nafar erkak guvoh bo'lishi shart?",
    options = listOf(
      "2 nafar",
      "To'rt nafar (arba'atu rijal) adolatli hur musulmon erkak",
      "1 erkak 2 ayol",
      "3 nafar"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الشهادة: ونصابه للزنى اربعة رجال وللقود وباقي الحدود رجلان...». Zino isbotlanishi uchun 4 nafar erkak guvoh shart.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shahodat, 146-bet"
  ),
  Question(
    id = 247,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkaklar ko'rishi joiz bo'lmagan ayollar xos holatlarida (tug'ruq, bokiralik) kimlarning guvohligi qabul qilinadi?",
    options = listOf(
      "Erkaklarning o'zi",
      "Bitta adolatli ayolning ham guvohligi kifoya qiladi",
      "Faqat tabib erkaklar",
      "Hech kimniki"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وللبكارة والولادة وعيوب النساء فيما لا يطلع الرجال امرأة...». Ayollarga xos ishlarda bitta ayolning guvohligi qabul bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shahodat, 147-bet"
  ),
  Question(
    id = 248,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Quyidagilardan qaysi birining guvohligi qabul qilinmaydi?",
    options = listOf(
      "Adolatli faqirning",
      "Ota-onaning bolasi foydasiga, er-xotinning bir-biri foydasiga, qazo qilingan fosiq va qazf haddi urilgan kishining",
      "Savdogarning",
      "Dehqonning"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا تصح شهادة الاصل لفرعه وفرعه لاصله واحد الزوجين للآخر ومحدود في قذف...». Ushbu yaqinlarning bir-biri foydasiga guvohligi qabul qilinmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shahodat, 148-bet"
  ),
  Question(
    id = 249,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkak kishiga ipak kiyim kiyish va tilla taqinchoq taqishning hukmi nima?",
    options = listOf(
      "Halol",
      "Harom (faqat urushda yoki to'rt barmoq kengligidagi ipak jiyak mustasno, kumush uzuk taqish joiz)",
      "Muboh",
      "Vojib"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الكراهية: وحل استعمال المفضض... لا الذهب والفضة للرجال... ولا يلبس رجل حريرا الا قدر اربعة اصابع...». Erkakka ipak va oltin haromdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 133-134-bet"
  ),
  Question(
    id = 250,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Vasiyat molning qancha qismigacha joiz bo'ladi?",
    options = listOf(
      "Molning yarmigacha",
      "Molning ko'pi bilan uchdan bir (sulus / 1/3) qismigacha begonalarga joiz (merosxo'rga esa boshqa merosxo'rlar roziligisiz vasiyat qilinmaydi)",
      "Butun moliga",
      "Faqat 10 foiziga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الوصايا: هي ايجاب بعد الموت وندبت باقل من الثلث... ولا لوارثه الا ان يجيز الورثة...». Vasiyat ko'pi bilan uchdan birga qilinadi va merosxo'rga ruxsatsiz vasiyat yo'q.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vasoyo, 183-bet"
  ),
  Question(
    id = 251,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkaklik yoki ayolligi noaniq bo'lgan inson (Xunso) jinsini qanday aniqlanadi?",
    options = listOf(
      "Bo'y-bastiga qarab",
      "Peshob qaysi a'zosidan oldin chiqishiga qarab: zaxardan chiqsa erkak, farjdan chiqsa ayol hisoblanadi",
      "Faqat yuziga qarab",
      "Hech qachon aniqlanmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الخنثى: هو ذو فرج وذكر فان بال من ذكره فذكر وان بال من فرجه فانثى فان استويا حكم بالاسبق...». Qaysi a'zodan peshob chiqishiga qarab jinsi belgilanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Xunso, 187-bet"
  ),
  Question(
    id = 252,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Musulmon kishi o'z vasiyatnomasini qanday yozishi mustahab?",
    options = listOf(
      "Faqat molini ko'paytirishni",
      "Tavhid kalimasi, tavba, qarzlarini ado etish va molining uchdan biridan kamrog'ini yaxshilikka vasiyat qilish",
      "Hamma molini davlatga topshirishni",
      "Hech qanday vasiyat qilmaslik"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وندبت باقل من الثلث عند غنى ورثته...». Vasiyatni uchdan birdan kamrog'iga qilish mustahabdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vasoyo, 183-bet"
  ),
  Question(
    id = 253,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Xunso mushkil namozda safning qayerida turadi?",
    options = listOf(
      "Erkaklarning eng oldingi safida",
      "Erkaklar va bolalar safidan keyin, lekin ayollar safidan oldinda turadi",
      "Ayollarning orqasida",
      "Xohlagan joyida"
    ),
    correctIndex = 1,
    explanation = "Matnda namoz saflari bayonida: erkaklar, keyin yosh bolalar, keyin xunsolar, eng orqada ayollar saf tortadi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot va Kitobul Xunso, 17, 187-bet"
  ),
  Question(
    id = 254,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qasosda erkak kishi ayolni o'ldirsa erkakdan qasos olinadimi?",
    options = listOf(
      "Yo'q, faqat diyat to'laydi",
      "Ha, erkak ayolni qasddan o'ldirsa undan qasos olinadi (va aksincha)",
      "Faqat ayol homilador bo'lsa",
      "Hech qachon olinmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ويقتل جمع بفرد وبالعكس... ويقاد الرجل بالمرأة وبالعكس». Erkak ayol uchun, ayol erkak uchun qasos qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Jinoyat, 171-bet"
  ),
  Question(
    id = 255,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qasomah (القسامة) nima va u qachon o'tkaziladi?",
    options = listOf(
      "Qasam ichish musobaqasi",
      "Bir mahallada qotili noma'lum o'lik topilsa, o'sha mahalla ahlidan 50 kishi «Biz o'ldirmadik va qotilni bilmaymiz» deb qasam ichadi va ular zimmasiga diyat yuklanadi",
      "Savdodagi qasam",
      "Hajdagi qasam"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب القسامة: فصل ميت به جرح... وجد في محلة ولا يعلم قاتله حلف خمسون رجلا... ثم قضى على اهلها بالدية». Qasoma noma'lum qatl holatida qo'llaniladi.",
    bookReference = "Muxtasarul Viqoya, Kitobud Diyat, 177-bet"
  ),
  Question(
    id = 256,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "«Muxtasarul Viqoya» asari qaysi fiqhiy mazhabga tegishli?",
    options = listOf(
      "Shofe'iy mazhabi",
      "Hanafiy mazhabi",
      "Molikiy mazhabi",
      "Hanbaliy mazhabi"
    ),
    correctIndex = 1,
    explanation = "Muxtasarul Viqoya Hanafiy mazhabining eng mashhur va e'tiborli matnlaridan biridir.",
    bookReference = "Muxtasarul Viqoya, Muqaddima, 1-2-bet"
  ),
  Question(
    id = 257,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Muallif Sadrush Shari'a ushbu kitobni qaysi asar asosida muxtasar (qisqartma) qilgan?",
    options = listOf(
      "«Al-Mabsut»",
      "Bobosi Tojush Shari'aning «Viqoyatur Rivoya fi Masoilih Hidoya» kitobi asosida",
      "«Sahihul Buxoriy»",
      "«Raddul Muxtor»"
    ),
    correctIndex = 1,
    explanation = "Matnda muallif aytadi: «حفظى كتاب وقاية الرواية في مسائل الهداية... اتخذت منه هذا المختصر...». Bobosi Tojush Shari'a tuzgan Viqoyaning muxtasaridir.",
    bookReference = "Muxtasarul Viqoya, Muqaddima, 2-3-bet"
  ),
  Question(
    id = 258,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "«Viqoyatur Rivoya» kitobi o'z navbatida qaysi buyuk asarning masalalarini jamlagan?",
    options = listOf(
      "Burhoniddin Marg'inoniyning «Al-Hidoya» asari",
      "Imom Muhammadning «Jomi'us Sag'ir»i",
      "Quduriy muxtasari",
      "Kanzud Daqoiq"
    ),
    correctIndex = 0,
    explanation = "Asarning to'liq nomi «Viqoyatur rivoya fi masa'ilil Hidoya» bo'lib, u Marg'inoniyning «Hidoya» kitobidagi masalalarning qaymog'idir.",
    bookReference = "Muxtasarul Viqoya, Muqaddima, 2-bet"
  ),
  Question(
    id = 259,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Muxtasarul Viqoya matnida «وعندهما» (va indahumo) deb kelganda kimlar nazarda tutiladi?",
    options = listOf(
      "Imom Molik va Imom Shofe'iy",
      "Sohibayn: Imom Abu Yusuf va Imom Muhammad ash-Shayboniy (rahimahumalloh)",
      "Imom Zufar va Hasan ibn Ziyod",
      "Marg'inoniy va Quduriy"
    ),
    correctIndex = 1,
    explanation = "Hanafiy fiqhida «Indahumo» (ikkilari nazdida) deganda Imomi A'zamning ikki buyuk shogirdi Abu Yusuf va Muhammad (sohibayn) nazarda tutiladi.",
    bookReference = "Muxtasarul Viqoya, Istilohot"
  ),
  Question(
    id = 260,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Muxtasarul Viqoyada «va qola Zufar» (وقال زفر) deb Imom Zufarning qavli nima maqsadda keltiriladi?",
    options = listOf(
      "Mazhabdan chiqish uchun",
      "Hanafiy mazhabining mujtahid imomlaridan biri bo'lgan Imom Zufarning qiyosiy nozik qarashlarini solishtirish uchun",
      "Faqat inkor qilish uchun",
      "Bekorchi so'z sifatida"
    ),
    correctIndex = 1,
    explanation = "Imom Zufar ibn Huzayl Abu Hanifaning peshqadam shogirdi va qiyosda eng mohir faqihlardan bo'lib, uning fatvolari ham mazhab boyligidir.",
    bookReference = "Muxtasarul Viqoya, Usulul fiqh"
  )
)
