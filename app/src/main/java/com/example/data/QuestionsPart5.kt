package com.example.data

import com.example.model.Question
import com.example.model.QuestionDifficulty

val questionsPart5: List<Question> = listOf(
  // G'ASB, VADIY'A, ORIYAT, SHIRKAT (261 - 280)
  Question(
    id = 261,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "G'asb (birovning molini o'zboshimchalik bilan nohaq tortib olish)ning hukmi nima?",
    options = listOf(
      "Muboh",
      "Katta gunoh bo'lib, olingan molni asliga zarar yetkazmay egasiga qaytarish farz, agar nobud bo'lsa mislini yoki qiymatini to'laydi (zomin bo'ladi)",
      "Faqat uzr so'raydi",
      "Yarmini qaytaradi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الغصب: هو اخذ مال متقوم محترم علنا بلا اذن مالكه... وحكمه الاثم ان علم ورد العين قائمة والغرم ان هلكت». G'asb harom va tovon to'lash vojibdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul G'asb, 112-bet"
  ),
  Question(
    id = 262,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Vadiy'a (omonat qo'yilgan mol) omonatchining qo'lida tajovuzsiz yoki beparvoliksiz o'z-o'zidan nobud bo'lsa tovon to'lanadimi?",
    options = listOf(
      "Ha, har doim to'laydi",
      "Yo'q, omonat qo'lida omonat bo'lib, qasddan yoki beparvolik bilan zoe qilmaguncha tovon to'lamaydi",
      "Faqat yarmini to'laydi",
      "Qamoqqa olinadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الوديعة: هي امانة تركت للحفظ وضمانها كالعارية وله حفظها بنفسه وعياله...». Tajovuz bo'lmasa omonatga tovon to'lanmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vadiy'a, 111-bet"
  ),
  Question(
    id = 263,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Oriyat (foydalanishga tekinga berilgan narsa)ning hukmi nima?",
    options = listOf(
      "Faqat sotish mumkin",
      "Egalikni emas, balki bir narsaning foydasini birovga tekinga berishdir; u ham omonat hisoblanadi",
      "Qarz kabidir",
      "Hadya hisoblanadi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب العارية: هي تمليك نفع بلا عوض... ولا تضمن بلا تعد ان هلكت». Oriyat bu manfaatni bepul berishdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Oriyat, 109-bet"
  ),
  Question(
    id = 264,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Shirkati Mufavaza (to'liq tenglik sherikligi) qanday bo'ladi?",
    options = listOf(
      "Faqat bitta ishda sheriklik",
      "Ikki sherik mol-mulkda, dinda, hurriyatda va barcha tijorat huquqlarida to'liq teng bo'lib, bir-biriga kafil va vakil bo'ladilar",
      "Faqat foydani teng bo'lish",
      "Har xil din vakillari o'rtasida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الشركة: وهي شركة متساويين مالا وحرية ودينا وتتضمن الوكالة والكفالة...». Mufavaza to'liq tenglik va kafil-vakillik sherikligidir.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shirkat, 124-bet"
  ),
  Question(
    id = 265,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Shirkati Inon (odatiy cheklangan tijorat sherikligi) qanday tuziladi?",
    options = listOf(
      "To'liq tenglik shart",
      "Sarmoyalari teng yoki turlicha bo'lishi mumkin, foyda kelishuvga ko'ra, zarar esa kiritilgan sarmoya miqdoriga ko'ra taqsimlanadi",
      "Zarar faqat bitta sherikka yuklanadi",
      "Faqat naqd pulsiz tuziladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وعنان وهو شركة في كل تجارة او نوع... مع تفاوت الربح وكون احدهما دراهم والآخر دنانير...». Zarar sarmoya barobarida bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shirkat, 124-bet"
  ),
  Question(
    id = 266,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Shirkati Sano'i' (hunarmandlar, masalan tikuvchilar yoki duradgorlar sherikligi) joizmi?",
    options = listOf(
      "Yo'q, harom",
      "Ha, ikki yoki undan ortiq kishi birgalikda buyurtmalarni qabul qilib, ishlab topilgan haqni kelishilgan nisbatda bo'lishishlari durustdir",
      "Faqat bitta oila a'zolari o'rtasida",
      "Faqat davlat korxonasida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وشركة الصنائع والتقبل وهي ان يشترك صانعان كخياطين او خياط وصباغ ويتقبلا العمل باجر بينهما صحت...». Hunarmandlar sherikligi durustdir.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shirkat, 125-bet"
  ),
  Question(
    id = 267,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Muzora'a (yerga ekin ekish sherikligi) Abu Hanifa (r.a.) va sohibayn (r.a.) nazdida qanday?",
    options = listOf(
      "Mutlaqo harom",
      "Abu Hanifa (r.a.) qiyosan durust emas deganlar, lekin sohibayn (Abu Yusuf va Muhammad) va Hanafiy fatvosi bo'yicha ehtiyoj yuzasidan joiz deb hukm qilingan",
      "Faqat paxta ekish mumkin",
      "Faqat meva ekish joiz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب المزارعة: هي عقد الزرع ببعض الخارج ولا تصح عند ابي حنيفة رحمه الله وصحت عندهما وبه يفتى...». Sohibayn qavlida fatvo berilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobul Muzora'a, 128-bet"
  ),
  Question(
    id = 268,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Musoqot (bog' parvarishlash sherikligi) nima?",
    options = listOf(
      "Daryodan suv tashish",
      "Daraxtlarni parvarish qilib sug'orish va hosilidan kelishilgan bir ulush (masalan uchdan bir, yarmi) olish shartnomasi",
      "Bog'ni sotib olish",
      "Yer haydash"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل المساقاة: هي دفع الشجر الى من يصلحه بجزء من ثمره وهي كالمزارعة...». Bog'ni hosil ulushiga parvarishlash musoqotdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Musoqot, 129-bet"
  ),
  Question(
    id = 269,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Ehyaul mavat (o'lik, qarovsiz yerni tiriltirish/obod qilish) bilan kishi o'sha yerga egalik qila oladimi?",
    options = listOf(
      "Yo'q, hech kim ega bo'la olmaydi",
      "Imomning (davlat rahbarining) ruxsati bilan qarovsiz yerni obod qilgan kishi unga egalik qiladi",
      "Faqat ijarachi bo'ladi",
      "Faqat 1 yilga beriladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب احياء الموات: هي ارض بلا نفع لانقطاع مائها ونحوه لا يعرف مالكها بعيدة عن العامر... من احياه ملكه ان اذن الامام...».",
    bookReference = "Muxtasarul Viqoya, Kitobul Ehyaul Mavat, 130-bet"
  ),
  Question(
    id = 270,
    chapterId = "muomala",
    chapterTitle = "Muomalot: Shuf'a, Taqsimot, Hadya, Ijara, Rahn",
    questionText = "Qazilgan xususiy quduqning atrofi (harimi) qancha masofani tashkil etadi?",
    options = listOf(
      "1 metr",
      "Tuya bilan suv tortiladigan quduq uchun har tarafidan 40 ziro', buloq uchun 500 ziro'",
      "100 metr",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فله حريمها للناضح اربعون ذراعا من كل جانب وفي الاصح وللعين خمسمائة...». Harim chegarasi shunday belgilanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ehyaul Mavat, 131-bet"
  ),

  // KAROHIYAT, ICHIMLIKLAR, JIHOD, HUQUQ (271 - 305)
  Question(
    id = 271,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Xamr (uzum suvidan tayyorlangan mast qiluvchi sharob)ning hukmi nima?",
    options = listOf(
      "Faqat ko'p ichish harom",
      "Oz miqdori ham, ko'p miqdori ham mutlaqo harom, o'zi najasati g'aliza, uni halol degan kofir bo'ladi",
      "Makruh",
      "Muboh"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الاشربة: حرم الخمر... وغلظت نجاسته ويكفر مستحلها... وحرم شرب دردي الخمر...». Xamr qat'iy harom va najasdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ashriba, 136-bet"
  ),
  Question(
    id = 272,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Xamrdan tayyorlangan sirka (xall)ning hukmi nima?",
    options = listOf(
      "Harom bo'lib qoladi",
      "Sirka bo'lib aylangach, u sof, halol va pok bo'ladi",
      "Najosat hisoblanadi",
      "Faqat dori uchun mumkin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وخل الخمر ولو بعلاج...». Xamrdan sirka hosil qilinsa u pok va halol bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ashriba, 136-bet"
  ),
  Question(
    id = 273,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkak kishiga qanday uzuk taqishga shariatda ruxsat berilgan?",
    options = listOf(
      "Oltin uzuk",
      "Og'irligi bir misqoldan (taxminan 4.25-4.5 gramm) oshmaydigan kumush uzuk",
      "Temir yoki mis uzuk",
      "Platina uzuk"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يتختم بحديد وصفر وحجر... وخاتم فضة... ولا يزاد على مثقال». Erkakka faqat bir misqoldan oshmagan kumush uzuk taqish joiz.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 134-bet"
  ),
  Question(
    id = 274,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Erkak kishi begona nomahram ayolning qaysi a'zolariga qarashi joiz (fitna xavfi bo'lmaganda)?",
    options = listOf(
      "Boshiga va sochiga",
      "Faqat yuzi va ikki kaftiga (zarurat bo'lsa oyoqlariga ham)",
      "Qo'llariga tirsakgacha",
      "Hech qayeriga qaray olmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وينظر الرجل من الاجنبية والسيدة الى الوجه والكفين وشرط الامن عن الشهوة...». Shahvatsiz holatda faqat yuz va kaftga qarash joiz.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 134-bet"
  ),
  Question(
    id = 275,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Tabib nomahram bemor ayolning qayerini ko'rishi mumkin?",
    options = listOf(
      "Butun tanasini",
      "Faqat davolanish uchun zarur bo'lgan kasal a'zosi o'rnigagina qaraydi",
      "Faqat yuzini",
      "Qarashi mutlaqo taqiqlangan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وينظر الى موضع المرض بقدر الضرورة...». Davolash joyiga faqat zarurat miqdoricha qarash ruxsat etiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 134-bet"
  ),
  Question(
    id = 276,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Nard (narda) o'yini va qimor o'ynashning hukmi nima?",
    options = listOf(
      "Muboh",
      "Harom va makruh (lahv va botil amallardan)",
      "Mustahab",
      "Makruhi tanzihiy"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وكره بيع العذرة... واللعب بالنرد والشطرنج والغناء وكل لهو...». Nard, shaxmat bilan mashg'ul bo'lish va barcha behuda lahvlar makruh/haromdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 135-bet"
  ),
  Question(
    id = 277,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Ihtikor (oziq-ovqat mahsulotlarini narxi ko'tarilsin deb sun'iy saqlab qolish / monopol monopoliya)ning hukmi nima?",
    options = listOf(
      "Halol savdo",
      "Agar odamlarga yoki shaharga zarar keltirsa makruhi tahrimiy (gunoh)",
      "Mustahab",
      "Savdogarga tavsiya etiladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واحتكار قوت البشر والبهائم في بلد يضر باهله... مكروه». Inson va hayvonlar yemishini monopol qilib saqlash makruhdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Karohiyat, 135-bet"
  ),
  Question(
    id = 278,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Ot go'shti (lahmul faras)ni yeyish Hanafiy mazhabida qanday?",
    options = listOf(
      "Qat'iy harom",
      "Abu Hanifa (r.a.) nazdida urush vositasi bo'lgani uchun makruh, sohibayn (r.a.) nazdida esa halol (va shu fatvoga olingan)",
      "Faqat bayramlarda halol",
      "Faqat bolalarga mumkin"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والخيل عند ابي حنيفة مكروه وعندهما حلال...». Abu Hanifada makruh, sohibaynda muboh deb fatvo berilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zaboyih, 138-bet"
  ),
  Question(
    id = 279,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Quyidagilardan qaysi hayvonlarning go'shti harom hisoblanadi?",
    options = listOf(
      "Quyon va kiyik",
      "Yirtqich oziq tishli hayvonlar (bo'ri, sher, qoplon), tirnoqli yirtqich qushlar, eshak va xachir",
      "Tuya va sigir",
      "Qo'y va tovuq"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وحرم ذو ناب او مخلب من سبع او طير... والحمر الاهلية والبغل...». Yirtqichlar, xachir va xonaki eshak haromdir.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zaboyih, 138-bet"
  ),
  Question(
    id = 280,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Iqror (birovning o'z zimmadagi haqqini tan olishi) qanday shart bilan durust bo'ladi?",
    options = listOf(
      "Majburlab iqror qildirish orqali",
      "Oqil, balog'atga yetgan, hur shaxsning o'z ixtiyori bilan qilgan iqrori",
      "Faqat qamoqda qilingan iqror",
      "Faqat yozma bo'lishi kerak"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الاقرار: هو اخبار بحق لآخر عليه... فلو اقر حر مكلف بحق صح...». Hur, mukallaf shaxsning ixtiyoriy iqrori durust va lozimdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Iqror, 150-bet"
  ),
  Question(
    id = 281,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Sulh (الصلح) shartnomasi qachon joiz bo'ladi?",
    options = listOf(
      "Halol narsani harom qilish uchun",
      "Iqror bilan, inkor bilan yoki sukut saqlash bilan nizo va da'voni to'xtatish uchun tuzilgan sulh joizdir",
      "Faqat sud zalida",
      "Faqat urushda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الصلح: هو عقد يرفع النزاع وصح باقرار وانكار وسكوت...». Sulh nizoni ko'taruvchi bitimdir.",
    bookReference = "Muxtasarul Viqoya, Kitobus Sulh, 158-bet"
  ),
  Question(
    id = 282,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Ikroh (الاکراه - majburlash) qachon shariatda e'tiborga olinadi?",
    options = listOf(
      "Har qanday ozgina do'q-po'pisa bilan",
      "O'ldirish, a'zosini kesish yoki qattiq urish bilan tahdid qilinganda va majburlaguvchi buni amalga oshirishga to'liq qodir bo'lganda (Ikrohi mulji')",
      "Faqat so'kish bilan",
      "Xat yozilganda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الاكراه: هو فعل يوقعه بغيره فيفوت رضاه او يفسد اختياره... سلطانا كان اولصا وخوف الفاعل ايقاعه...». Nafsni yoki a'zoni halok qilish xavfi bilan majburlash ikrohdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ikroh, 179-bet"
  ),
  Question(
    id = 283,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Majburlangan kishi (mukrah) kufr so'zini aytsa kofir bo'ladimi?",
    options = listOf(
      "Ha, darhol iymondan chiqadi",
      "Agar qalbi iymon bilan xotirjam bo'lsa, tilida aytishga ruxsat bor (lekin sabr qilib o'ldirilsa ulkan ajr oladi)",
      "Kafforat to'laydi",
      "Iymoni qaytmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ورخص به اظهار الكفر مطمئنا قلبه بالايمان وبالصبر اجر...». Qalbida iymon mustahkam bo'lsa o'lim xavfida tilida kufr aytishga ruxsat berilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobul Ikroh, 180-bet"
  ),
  Question(
    id = 284,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Hajr (tasarruf huquqini taqiqlash) kimlarga nisbatan qo'llaniladi?",
    options = listOf(
      "Faqat kambag'allarga",
      "Yosh bola (sag'ir), majnun (aqldan ozgan) va qulga; Abu Hanifa (r.a.) nazdida balog'atga yetgan safih (molini sovuruvchi) kishiga hajr qilinmaydi",
      "Faqat musofirlarga",
      "Faqat qariyalarga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الحجر: هو منع نفاذ القول وسببه الصغر والجنون والرق... ولا يحجر بسفه وفسق ودين عند ابي حنيفة...». Abu Hanifada balog'atga yetgan oqil kishi safih bo'lsa ham hajr qilinmaydi (sohibaynda qilinadi).",
    bookReference = "Muxtasarul Viqoya, Kitobul Hajr, 180-bet"
  ),
  Question(
    id = 285,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Bola necha yoshga to'lganda balog'atga yetgan hisoblanadi (agar zohiriy belgilar ko'rinmasa)?",
    options = listOf(
      "10 yosh",
      "Abu Hanifa (r.a.) nazdida o'g'il bola 18 yosh, qiz bola 17 yosh; sohibayn nazdida har ikkisi 15 yoshga yetganda balog'atga yetgan hisoblanadi (va fatvo 15 yoshgadir)",
      "25 yosh",
      "20 yosh"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وبلوغ الغلام بالاحتلام والانزال... فان لم يوجد فحين يتم ثماني عشرة سنة ولها سبع عشرة سنة... وبه يفتى وادنى مدته له اثنتى عشرة سنة ولها تسع سنين». Sohibaynda 15 yoshdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Hajr, 181-bet"
  ),
  Question(
    id = 286,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Vasiyat qiluvchi o'z vasiyatidan tiriklik chog'ida qaytishi (ruju' qilishi) mumkinmi?",
    options = listOf(
      "Yo'q, mutlaqo mumkin emas",
      "Ha, tirik ekan, o'z vasiyatidan so'z bilan yoki fe'l bilan (masalan o'sha narsani sotib yuborish bilan) qaytishi mumkin",
      "Faqat qozi ruxsati bilan",
      "Yarmini qaytara oladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ورجع عنها بقول صريح او فعل...». Vasiyat qiluvchi tiriklik chog'ida xohlagan payt vasiyatidan qaytish huquqiga ega.",
    bookReference = "Muxtasarul Viqoya, Kitobul Vasoyo, 184-bet"
  ),
  Question(
    id = 287,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Merosxo'r o'z meros qoldiruvchisini qasddan o'ldirsa meros oladimi?",
    options = listOf(
      "Ha, o'z ulushini oladi",
      "Yo'q, qotil merosdan butunlay mahrum bo'ladi",
      "Faqat yarmini oladi",
      "Qozining xohishiga ko'ra"
    ),
    correctIndex = 1,
    explanation = "Qotillik merosdan mahrum qiluvchi to'siqlardan biridir («La miyrosa lil-qotil»).",
    bookReference = "Muxtasarul Viqoya, Kitobul Faraiz va Jinoyat"
  ),
  Question(
    id = 288,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qazoda da'vogar (mudda'iy) kim va javobgar (mudda'o alayh) kim?",
    options = listOf(
      "Ikkalasi ham bir xil",
      "Da'vogar — da'vosini tark qilsa o'z holiga qo'yiladigan kishi; Javobgar — tark qilsa majburlanadigan kishi",
      "Da'vogar faqat davlat",
      "Faqat qozi belgilaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الدعوى: هي اخبار بحق له على غيره... والمدعي من لا يجبر على الخصومة والمدعى عليه من يجبر...». Da'voni tark etsa holiga qo'yiluvchi mudda'iydir.",
    bookReference = "Muxtasarul Viqoya, Kitobud Da'vo, 152-bet"
  ),
  Question(
    id = 289,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Agar da'vogarning guvohi bo'lmasa, javobgarga nima taklif qilinadi?",
    options = listOf(
      "Qamoqqa tashlanadi",
      "Qasam (yamin) ichish taklif qilinadi, agar qasam ichsa da'vo rad etiladi, qasamdan bosh tortsa (nukul qilsa) da'vo qanoatlantiriladi",
      "Molining yarmi olinadi",
      "Hech narsa taklif qilinmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فان لم يقم حلفه ان طلبه خصمه فان نكل مرة او سكت بلا آفة وقضى بالنكول...». Guvoh bo'lmasa yamin buyuriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobud Da'vo, 153-bet"
  ),
  Question(
    id = 290,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Shahodat (guvohlik)da da'vo qilinayotgan haqni bilib turib yashirishning hukmi nima?",
    options = listOf(
      "Muboh",
      "Harom va gunohi kabira (talab qilinganda guvohlikni ado etish vojibdir)",
      "Mustahab",
      "Faqat pul olsa vojib"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وتجب بطلب المدعي...». Talab qilinganda guvohlik berish vojibdir.",
    bookReference = "Muxtasarul Viqoya, Kitobush Shahodat, 146-bet"
  ),
  Question(
    id = 291,
    chapterId = "tahorat",
    chapterTitle = "Tahorat kitobi",
    questionText = "Tahoratda bo'yinga mash tortishning hukmi nima?",
    options = listOf(
      "Farz",
      "Mustahab / adab (tomoqqa esa mash tortilmaydi)",
      "Harom",
      "Vojib"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومستحبه التيامن ومسح الرقبة...». O'ngdan boshlash va bo'yinga mash tortish mustahabdir (halqumga emas).",
    bookReference = "Muxtasarul Viqoya, Kitobut Tahorat, 3-bet"
  ),
  Question(
    id = 292,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Namozda «Fotiha» surasini o'qishning hukmi Hanafiy mazhabida qanday?",
    options = listOf(
      "Farz",
      "Vojib (farz namozining dastlabki ikki rakatida va vitr hamda naflning har bir rakatida)",
      "Sunnat",
      "Mustahab"
    ),
    correctIndex = 1,
    explanation = "Matnda vojiblar bayonida: «وواجبها قراءة الفاتحة وضم سورة...». Hanafiy mazhabida Fotiha o'qish vojibdir (farz esa mutlaq qiroatdir).",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 13-bet"
  ),
  Question(
    id = 293,
    chapterId = "namoz_1",
    chapterTitle = "Namoz: Vaqtlar, Shartlar va Sifatlar",
    questionText = "Quyosh chiqqandan keyin to zavolgacha bo'lgan vaqtda qaysi nafl namozni o'qish mustahab?",
    options = listOf(
      "Vitr",
      "Zuxo (Choshgoh) namozi",
      "Kusuf",
      "Xavf"
    ),
    correctIndex = 1,
    explanation = "Quyosh bir nayza bo'yi ko'tarilgach zavolgacha Zuxo (Choshgoh) namozi o'qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 20-bet"
  ),
  Question(
    id = 294,
    chapterId = "namoz_2",
    chapterTitle = "Namoz: Imomat, Sajdalar va Maxsus namozlar",
    questionText = "Bir kishi namozda birinchi qa'dada o'tirishni unutib, uchinchiga tik turib ketayotgan bo'lsa nima qiladi?",
    options = listOf(
      "Agar turganga yaqinroq bo'lsa turishni davom ettiradi va oxirida sajdai sahv qiladi; agar o'tirishga yaqinroq bo'lsa o'tiradi",
      "Darhol yerga yiqilib sajda qiladi",
      "Namozni boshidan boshlaydi",
      "Hech narsa qilmaydi"
    ),
    correctIndex = 0,
    explanation = "Matnda: «فاذا لم يقعد اولا وهو اليه اقرب قعد ولا سهو عليه والا قام وسجد للسهو». Turganga yaqin bo'lsa davom etib sajdai sahv qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobus Salot, 23-bet"
  ),
  Question(
    id = 295,
    chapterId = "zakot",
    chapterTitle = "Zakot kitobi",
    questionText = "Oshir (العاشر) kim?",
    options = listOf(
      "Qo'riqchi",
      "Davlat tomonidan yo'llarda savdogarlarning o'tib ketayotgan mollaridan zakot va bojlarni yig'ishga tayinlangan mansabdor shaxs",
      "Dehqon",
      "Chopon"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب نصب العاشر: فصل وينصب العاشر على الطريق لاخذ زكوة التجار...». Yo'lda tijorat mollaridan zakot oluvchi shaxs Oshirdir.",
    bookReference = "Muxtasarul Viqoya, Kitobuz Zakot, 33-bet"
  ),
  Question(
    id = 296,
    chapterId = "roza",
    chapterTitle = "Ro'za kitobi",
    questionText = "Ramazon ro'zasida misvok ishlatishning hukmi qanday?",
    options = listOf(
      "Ro'zani buzadi",
      "Makruh emas, kunning boshida ham, oxirida ham misvok ishlatish sunnatdir",
      "Harom",
      "Kafforat keltiradi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يكره السواك والكحل...». Ro'zadorga misvok ishlatish va surma qo'yish makruh emas.",
    bookReference = "Muxtasarul Viqoya, Kitobus Savm, 38-bet"
  ),
  Question(
    id = 297,
    chapterId = "haj",
    chapterTitle = "Haj kitobi",
    questionText = "Ehromdagi kishi o'z xotini bilan shahvatsiz quchoqlashsa nima bo'ladi?",
    options = listOf(
      "Haji buziladi",
      "Agar inzol (maniy chiqish) bo'lmasa haji buzilmaydi, lekin makruh ish qilgan bo'ladi",
      "Kafforat vojib",
      "Hech narsa bo'lmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «او قبل او لمس ان انزل قضى والا فلا». Shahvat bilan inzol bo'lmasa haj buzilmaydi, inzol bo'lsa qazo lozim bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Haj, 38-bet"
  ),
  Question(
    id = 298,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Nikohda «Fuzuliy» (o'zicha begona kishining nomidan ruxsatsiz nikoh bitimini tuzgan kishi)ning hukmi nima?",
    options = listOf(
      "Bitim mutlaqo botildir",
      "Bitim mavquf (to'xtatilgan) bo'ladi, agar o'sha shaxs keyinchalik ijozat bersa nafiz bo'ladi, rad qilsa bekor bo'ladi",
      "Darhol kuchga kiradi",
      "Faqat gunoh bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ووقف نكاح الفضولى على الاجازة...». Fuzuliyning nikohi ijozat berilishiga bog'liq mavquf bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 52-bet"
  ),
  Question(
    id = 299,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Raj'iy taloq qilingan ayolga idda ichida qaytish (raj'at) qanday amalga oshadi?",
    options = listOf(
      "Yangi mahr va yangi nikoh bilan",
      "Idda muddati ichida so'z bilan («Xotinimni qaytardim») yoki fe'l bilan (shahvat bilan teginish, yaqinlik qilish) hech qanday yangi nikohsiz qaytariladi",
      "Faqat qozi orqali",
      "Ayol roziligi bilan faqat"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب الرجعة في العدة: تصح الرجعة في العدة... بنحو راجعتك وبوطئها ومسها بشهوة...». Raj'iy taloqda idda ichida so'z yoki fe'l bilan qaytarish durust bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 62-bet"
  ),
  Question(
    id = 300,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Uch taloq qilingan ayol o'zining avvalgi eriga qachon qayta halol bo'ladi?",
    options = listOf(
      "Iddasi tugashi bilanoq",
      "Boshqa erga haqiqiy nikohlanib, u bilan haqiqiy qovushgach, ikkinchi er o'z xohishi bilan taloq qilsa yoki vafot etsa va idda o'tgandan keyingina",
      "Hech qachon halol bo'lmaydi",
      "Faqat jarima to'lab"
    ),
    correctIndex = 1,
    explanation = "Matnda: «حتى يطأها زوج آخر بنكاح صحيح وتمضي عدة طلاقه او موته...». Boshqa erga nikohlanib, qovushib, so'ng undan taloq bo'lib idda o'tgachgina avvalgi eriga halol bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 62-bet"
  ),
  Question(
    id = 301,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Qozoqlik / Yo'lto'sarlik (Qat'ut toriq) qilgan kimsalarga qanday jazo beriladi?",
    options = listOf(
      "Faqat jarima",
      "Faqat mol olsa qo'l-oyoqlari qarama-qarshi kesiladi, odam o'ldirsa qatl qilinadi yoki osiladi, ikkalasini qilsa qatl qilinib xochga osiladi",
      "Qamoqqa olinmaydi",
      "Kechirib yuboriladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وقاطع الطريق قبل اخذ مال وقتل حبس حتى يتوب وان اخذ ونصاب قطع يده ورجله من خلاف وان قتل بلا اخذ قتل حدا...».",
    bookReference = "Muxtasarul Viqoya, Kitobus Sariqa, 164-bet"
  ),
  Question(
    id = 302,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Bag'iylar (islomiy odil davlatga qarshi nohaq qurolli isyon ko'targanlar)ning hukmi nima?",
    options = listOf(
      "Kofir deb e'lon qilinadi",
      "Ular kofir emas, balki fosiq isyonchilardir; avval haqqa chaqiriladi, bo'lmasa fitnani to'xtatish uchun jang qilinadi, qurollari olinadi ammo mol-mulki talon-toroj qilinmaydi",
      "Darhol qatl qilinadi",
      "Kafillikka beriladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب البغاة: قوم مسلمون خرجوا عن طاعة الامام فيدعوهم الى العود... وان كان لهم فئة ويجهز على جريحهم... ولا يسبى ذريتهم...».",
    bookReference = "Muxtasarul Viqoya, Kitobul Jihod, 169-bet"
  ),
  Question(
    id = 303,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Murtad (islom dinidan qaytgan kishi)ga tavba qilish uchun necha kun muhlat beriladi?",
    options = listOf(
      "1 soat",
      "Uch kun (salosata ayyam) muhlat berilib, shubhalari yoritiladi va tavbaga chaqiriladi",
      "Bir oy",
      "Muhlat berilmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومن ارتد والعياذ بالله عرض عليه الاسلام وكشفت شبهته فان استمهل حبس ثلثة ايام فان تاب والاقبل...». Uch kun muhlat beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Jihod, 168-bet"
  ),
  Question(
    id = 304,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "Ayol kishi murtad bo'lsa (dindan qaytsa) Hanafiy mazhabida o'ldiriladimi?",
    options = listOf(
      "Ha, darhol qatl qilinadi",
      "Yo'q, ayol kishi o'ldirilmaydi, balki tavba qilguncha yoki islomga qaytguncha qamoqda saqlanadi",
      "Surgan qilinadi",
      "Jarima to'laydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا تقتل مرتدة وتحبس حتى تسلم...». Hanafiy mazhabida ayol murtad o'ldirilmaydi, balki tavba qilguncha hibsda tutiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Jihod, 169-bet"
  ),
  Question(
    id = 305,
    chapterId = "jinoyat_hudud",
    chapterTitle = "Jinoyat, Hudud, Qazo va Turli masalalar",
    questionText = "«Muxtasarul Viqoya» asari necha asr davomida Movarounnahr va butun islom olamida asosiy darslik bo'lib xizmat qilib kelmoqda?",
    options = listOf(
      "100 yil",
      "Yetti yuz yildan (700+) ziyod vaqt davomida",
      "50 yil",
      "Faqat 10 yil"
    ),
    correctIndex = 1,
    explanation = "Alloma Sadrush Shari'a hijriy 747 (milodiy 1346) yilda vafot etgan bo'lib, uning asari 700 yildan ortiq vaqtdan beri Hanafiy madrasalarida asosiy qo'llanmadir.",
    bookReference = "Muxtasarul Viqoya, Tarixiy manbalar"
  )
)
