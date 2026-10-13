package com.example.data

import com.example.model.Question
import com.example.model.QuestionDifficulty

val questionsPart3: List<Question> = listOf(
  // NIKOH VA RIZO' (161 - 185)
  Question(
    id = 161,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Nikoh shartnomasi (aqdi) qanday lafzlar bilan bog'lanadi?",
    options = listOf(
      "Kelajak zamon fe'llari bilan («uylanaman», «tegasiz»)",
      "O'tgan zamon (moziy) lafzlari orqali ijob va qabul bilan («uylandim», «nikohlendim»)",
      "Faqat niyat qilish bilan so'zsiz",
      "Faqat yozma tilxat bilan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ينعقد بايجاب وقبول لفظهما ماض كتزوجت وتزوجت او امر وماض...». Nikoh o'tgan zamon fe'llari bilan ijob va qabul orqali bog'lanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 49-bet"
  ),
  Question(
    id = 162,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Nikoh sahih (durust) bo'lishi uchun nechta guvoh shart?",
    options = listOf(
      "1 ta erkak kifoya",
      "Kamida 2 nafar hur, oqil, balog'atga yetgan musulmon erkak yoki 1 erkak va 2 ayol",
      "Faqat 4 ta ayol",
      "Guvoh shart emas"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وشرط سماع كل منهما لفظ الآخر وحضور حرين او حر وحرتين مكلفين مسلمين...». Ikki hur erkak yoki bir hur erkak va ikki hurra ayol guvoh bo'lishi shart.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 49-bet"
  ),
  Question(
    id = 163,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Fosiq (gunohkor) kishilar guvohligida nikoh o'qilsa nikoh durust bo'ladimi?",
    options = listOf(
      "Yo'q, mutlaqo botil bo'ladi",
      "Ha, Hanafiy mazhabida fosiqlar guvohligida ham nikoh sahih bo'ladi",
      "Faqat qayta o'qilishi kerak",
      "Harom bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وصح عند فاسقين». Hanafiy fiqhida fosiqlar huzuridagi nikoh ham sahih bog'lanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 49-bet"
  ),
  Question(
    id = 164,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Musulmon erkak qanday din vakilasiga uylanishi joiz?",
    options = listOf(
      "Butparast va majusiylarga",
      "Kitobiy ayolga (yahudiy yoki nasroniy) uylanishi joiz",
      "Dinsiz ateist ayolga",
      "Hech qanday boshqa dindagi ayolga uylana olmaydi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وصح نكاح الكتابية ولو امة والامة مع طول الحرة...». Musulmon erkakka ahli kitob ayolga uylanish joizdir.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 50-bet"
  ),
  Question(
    id = 165,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Bir vaqtning o'zida bir erkak qaysi ikki ayolni o'z nikohida jamlashi harom?",
    options = listOf(
      "Ikki begona ayolni",
      "Ikki opa-singilni, shuningdek ayol bilan uning ammasi yoki xolasini bir nikohda jamlash harom",
      "Faqat turli millatdagi ayollarni",
      "Beva bilan qizni"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يجمع بين اختين... ولا بين امرأة وعمتها او خالتها». Ikki opa-singilni yoki ayol bilan uning amma-xolasini jamlash haromdir.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 50-bet"
  ),
  Question(
    id = 166,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Bir ayolga shahvat bilan qo'l tekkizgan yoki o'pgan erkakning hukmi (hurmati musohara) nima bo'ladi?",
    options = listOf(
      "Hech narsa bo'lmaydi",
      "U ayolning onalari va qizlari ushbu erkakka abadiy harom bo'ladi",
      "Faqat kafforat to'laydi",
      "Faqat tahorat oladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وحرم اصله وفرعه وفرع اصله القريب... وموطوءة وزوجة اصله وفرعه وكل هذه رضاعا وفرع مزنيته وممسوسته». Shahvat bilan tegilgan ayolning onalari va qizlari harom bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 49-50-bet"
  ),
  Question(
    id = 167,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Balog'atga yetgan oqila hurra qiz o'zini o'zi tengiga (kufu'iga) valiysiz nikohlasa nikoh bog'lanadimi?",
    options = listOf(
      "Yo'q, mutlaqo bog'lanmaydi",
      "Abu Hanifa (r.a.) nazdida bog'lanadi va nafiz bo'ladi",
      "Faqat podshoh ruxsati bilan",
      "Hech qachon joiz emas"
    ),
    correctIndex = 1,
    explanation = "Matnda: «نفذ نكاح حرة مكلفة ولو من غير كفء وبلا ولي وله الاعتراض...». Balog'atga yetgan qizning o'zini nikohlashi Abu Hanifa va Abu Yusufda nafizdir, tengi bo'lmasa valiy e'tiroz qilib bekor qildirishi mumkin.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 50-bet"
  ),
  Question(
    id = 168,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Nikohda kufu' (tenglik) qaysi jihatlarda e'tiborga olinadi?",
    options = listOf(
      "Faqat boylikda",
      "Nasabda, Islomda, Hurriyatda, Diyonatda (taqvoda), Mahr va nafaqaga qodirlikda va Kasb-hunarda",
      "Faqat chiroy va qaddi-qomatda",
      "Faqat yoshda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وتعتبر الكفاءة في النكاح نسبا... واسلاما... وحرية... وديانة... ومالا... وحرفة». Tenglik mana shu jihatlarda e'tiborga olinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 51-52-bet"
  ),
  Question(
    id = 169,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Mahrning eng kam miqdori qancha (aqallul mahr)?",
    options = listOf(
      "Bir dinor",
      "O'n dirham (asharatu darohim — taxminan 30-31 g kumush qiymati)",
      "Bir tiyin",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «اقل المهر عشرة دراهم فتجب ان سمى دونها». Mahrning eng kami 10 dirhamdir. Agar 10 dirhamdan kam belgilansa ham, 10 dirham berish vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 52-bet"
  ),
  Question(
    id = 170,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Er-xotin mahrni aytmasdan nikohlansalar, xotinga qanday mahr vojib bo'ladi?",
    options = listOf(
      "Mahr berilmaydi",
      "Mahri misl (otasining urug'idagi o'ziga teng qizlarning mahri miqdori)",
      "Faqat 10 dirham",
      "Erining topishiga qarab"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ومهر المثل بعدها... ويجب مهر المثل كما مر او صفته فالوسط او قيمته». Mahr belgilanmagan bo'lsa mahrul-misl vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 52-53-bet"
  ),
  Question(
    id = 171,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Er xotini bilan qovushmasdan va xilvati sahiha bo'lmasdan oldin uni taloq qilsa, belgilangan mahrning qanchasi beriladi?",
    options = listOf(
      "Hammasi beriladi",
      "Belgilangan mahrning teng yarmi beriladi (nisfi mahr)",
      "Hech narsa berilmaydi",
      "Uchdan biri"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان طلق قبل وطء وخلوة فنصف الاخس». Yaqinlik va xilvatdan oldin taloq qilsa mahrning yarmi beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 53-bet"
  ),
  Question(
    id = 172,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Mahr belgilanmagan bo'lib, qovushishdan oldin taloq qilingan ayolga nima beriladi?",
    options = listOf(
      "Yarim mahr",
      "Mut'a (uch qism kiyim-bosh: ko'ylak, ro'mol va yopinchiq)",
      "Hech narsa berilmaydi",
      "Faqat non"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فالمتعة قبلها ومهر المثل بعدها... والمتعة درع وخمار وملحفة». Yaqinlikdan oldin mahr belgilanmagan holatda taloq qilinganga mut'a beriladi.",
    bookReference = "Muxtasarul Viqoya, Kitobun Nikoh, 52-bet"
  ),
  Question(
    id = 173,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Emizish (rizo') orqali nikoh harom bo'lish muddati Imomi A'zam Abu Hanifa (r.a.) nazdida qancha?",
    options = listOf(
      "1 yil",
      "O'ttiz oy (ikki yarim yil / hawlayni va nisf)",
      "5 yil",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «يثبت بمصة في حولين ونصف فقط امومة المرضعة وابوة زوج لبنها...». Abu Hanifa (r.a.) nazdida 2 yarim yil (30 oy) ichidagi emish bilan haromlik sobit bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobur Rizo', 56-bet"
  ),
  Question(
    id = 174,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Emizish bilan nimalar harom bo'ladi?",
    options = listOf(
      "Faqat emizgan ayolning o'zi",
      "Nasab orqali qaysi qarindoshlar harom bo'lsa, emish orqali ham barcha o'shalar harom bo'ladi",
      "Merosxo'r ham bo'ladi",
      "Faqat emakdosh aka-uka"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فيحرمان مع قومهما عليه كالنسب للمرضعة... وتَحِلُّ أُخْتُ أَخِيهِ رَضَاعًا». Nasabdan harom bo'lgan barcha qarindoshlar emish sababli ham harom bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobur Rizo', 56-bet"
  ),
  Question(
    id = 175,
    chapterId = "nikoh",
    chapterTitle = "Nikoh va Emizish kitobi",
    questionText = "Emizgan ayolga emilgan bola merosxo'r bo'ladimi?",
    options = listOf(
      "Ha, to'liq meros oladi",
      "Yo'q, emish faqat nikohni harom qiladi, lekin meros huquqini bermaydi va nafaqani vojib qilmaydi",
      "Faqat uchdan birini oladi",
      "Otasining merosini oladi"
    ),
    correctIndex = 1,
    explanation = "Emizish faqat mahramlik va nikoh haromligini keltirib chiqaradi, nasabiy meros va nafaqani sobit qilmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobur Rizo', 56-bet"
  ),

  // TALOQ, IDDA VA NAFAQA (176 - 190)
  Question(
    id = 176,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Sunniy taloqning «Ahsan» (eng go'zal) shakli qanday?",
    options = listOf(
      "Bir vaqtda uch taloq qo'yish",
      "Ayol poklik holida bo'lganida (tuhrda) yaqinlik qilmasdan bir dona taloq qo'yib, idda tugaguncha boshqa taloq qo'ymaslik",
      "Hayz vaqtida taloq qilish",
      "Har oyda uch taloq qo'yish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «واحسنه طلقة فقط في طهر لا وطء فيه وحسنه وهو السني طلقة لغير المدخولة... والتفريق في الاطهار». Poklikda yaqinliksiz bir taloq qo'yib idda o'tkazish ahsan taloqdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 56-bet"
  ),
  Question(
    id = 177,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Bid'iy taloq qaysi va uning hukmi nima?",
    options = listOf(
      "Eng savobli taloq",
      "Hayz ko'rayotgan vaqtda taloq qo'yish yoki bir vaqtda uch taloqni birdan aytish; bu ish gunoh bo'lsa-da taloq tushadi",
      "Taloq hisoblanmaydi",
      "Faqat qozining talog'i"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وبدعـيّه واحدة في طهر وطئت فيه او حيض ومفروقة وما فوقها بلا رجعة». Hayzda yoki birdaniga uchtasini qo'yish bid'iy bo'lib, gunohdir, ammo taloq tushadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 57-bet"
  ),
  Question(
    id = 178,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Sarih lafzlar («Sen taloqsan») bilan aytilgan taloq qanday taloq hisoblanadi?",
    options = listOf(
      "Har doim uch taloq",
      "Raj'iy taloq (idda ichida nikohsiz qaytarib olish mumkin bo'lgan taloq)",
      "Boin taloq",
      "Bekor bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وصريحه ما استعمل فيه دون غيره مثل انت طالق... ويقع به رجعية ابدا». Sarih lafz bilan doim raj'iy taloq tushadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 57-bet"
  ),
  Question(
    id = 179,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Kinoya lafzlar («Chiqib ket», «Sen menga haromsan», «Idda saqla») orqali taloq qachon tushadi?",
    options = listOf(
      "Har qanday holatda darhol",
      "Erning taloq niyati bo'lsa yoki holat (janjal, taloq so'rash) bunga dalolat qilsa, va u boin taloq bo'ladi",
      "Hech qachon tushmaydi",
      "Faqat raj'iy bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وكنايته ما يحتمل وغيره فنحو اخرجي واذهبي... ان نواها والافبائنة». Kinoya lafzlar niyat yoki holat dalolati bilan tushadi va u boindir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 58-59-bet"
  ),
  Question(
    id = 180,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Er xotiniga «Ixtiyor o'zingda» (Amruki biyadiki) desa, ayol qachongacha o'zini taloq qilishga haqli?",
    options = listOf(
      "Butun umr",
      "O'sha turgan majlisi davomida; agar majlis o'zgarsa yoki boshqa ishga kirishsa ixtiyor bekor bo'ladi",
      "3 kun ichida",
      "Bir oy ichida"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل تفويض طلاقها يتقيد بمجلس علمها الا ان يقول كلما شئت... وانما يختلف بالقيام او الذهاب او الشروع في قول او عمل...». Majlis o'zgarishi bilan ixtiyor botil bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 59-bet"
  ),
  Question(
    id = 181,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Ilo' nima va uning muddati qancha?",
    options = listOf(
      "Ayolini onasiga o'xshatish",
      "To'rt oy yoki undan ko'proq muddat xotiniga yaqinlik qilmaslikka qasam ichish",
      "Ayoliga mehr bermaslik",
      "Bir kunlik arazlashish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الايلاء حلف يمنع وطء الزوجة اربعة اشهر وحرة وشهرين امة...». Erkak o'z ayoliga 4 oy yaqinlashmaslikka qasam ichishi ilo' deyiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 63-bet"
  ),
  Question(
    id = 182,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Xul' (الخلع) nima va uning natijasida qanday taloq voqe' bo'ladi?",
    options = listOf(
      "Erning o'z xohishi bilan bepul taloq qilishi",
      "Er-xotin kelishib, xotin erga mol evaziga nikohni bekor qilishi; natijada bitta boin taloq tushadi",
      "Raj'iy taloq",
      "Uch taloq"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل لا بأس بالخلع عند الحاجة... وهو طلاق بائن ويجب عليها بدله». Xul' mol evaziga bo'lib, boin taloq hisoblanadi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 63-64-bet"
  ),
  Question(
    id = 183,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Zihor deb nimaga aytiladi?",
    options = listOf(
      "Xotinini urish",
      "Erning o'z xotinini o'ziga nikohi abadiy harom bo'lgan ayolning (onasi, opasi) qarash harom bo'lgan a'zosiga o'xshatishi («Sen menga onamning orqasideksan»)",
      "Xotiniga boshqa ism qo'yish",
      "Uyiga kiritmaslik"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل الظهار تشبيه ما يضاف اليه الطلاق من الزوجة بما يحرم اليه النظر من عضو محرمه...». Zihor kafforatsiz yaqinlikni harom qiladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 64-65-bet"
  ),
  Question(
    id = 184,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Li'on nima?",
    options = listOf(
      "Xotiniga tuhmat qilish va qozi huzurida har biri to'rt marta qasam ichib, beshinchisida la'nat va g'azab tilashi",
      "Oddiy janjallashish",
      "Mahrni qaytarib olish",
      "Meros taqsimoti"
    ),
    correctIndex = 0,
    explanation = "Matnda: «مطلب اللعان: فصل من قذف بالزنى زوجته العفيفة... فيقول اربعا اشهد بالله اني صادق... وفي الخامسة لعنة الله عليه ان كان كاذبا...».",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 65-66-bet"
  ),
  Question(
    id = 185,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Taloq qilingan ozod ayolning iddasi qancha (hayz ko'radigan bo'lsa)?",
    options = listOf(
      "1 oy",
      "3 ta to'liq hayz (uch hayz o'tishi)",
      "40 kun",
      "1 yil"
    ),
    correctIndex = 1,
    explanation = "Matnda: «فصل العدة تحيض للطلاق والفسخ ثلث حيض كوامل». Hayz ko'radigan hurra ayolning taloq iddasi 3 ta to'la hayzdir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 67-bet"
  ),
  Question(
    id = 186,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Eri vafot etgan ayolning iddasi qancha?",
    options = listOf(
      "3 hayz",
      "To'rt oy-u o'n kun (4 oy 10 kun)",
      "Bir yil",
      "40 kun"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وللموت اربعة اشهر وعشرا». Vafot iddasi 4 oy va 10 kundir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 67-bet"
  ),
  Question(
    id = 187,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Homilador ayolning taloq yoki vafot iddasi qachon tugaydi?",
    options = listOf(
      "4 oy 10 kunda",
      "Homilasini to'liq tuqqanida (vaqti qisqa bo'lsa ham)",
      "Bolasi 2 yoshga to'lganda",
      "9 oy o'tganda"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وللحامل وضع حملها». Homilador ayolning iddasi homilasini tuqqanida tugaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 68-bet"
  ),
  Question(
    id = 188,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Hidona (bolani tarbiyalash) haqqi er-xotin ajrashganda birinchi kimga beriladi?",
    options = listOf(
      "Otaga",
      "Onaga (agar u begona nomahramga turmushga chiqmagan bo'lsa)",
      "Qozi o'ziga oladi",
      "Boboga"
    ),
    correctIndex = 1,
    explanation = "Matnda: «مطلب الحضانة: فصل الحضانة للام بلا جبرها... وبنكاح غير محرم سقط حقها». Ona nomahramga turmushga chiqmaguncha bolaga qarashga eng haqlidir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 69-bet"
  ),
  Question(
    id = 189,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "O'g'il bolani ona qaysi yoshgacha o'z qaramog'ida saqlashga haqli?",
    options = listOf(
      "Balog'atga yetguncha",
      "O'zi mustaqil yeb-ichib, kiyinib, istinjo qila oladigan yoshgacha (taxminan 7 yoshgacha)",
      "2 yoshgacha",
      "Chegarasi yo'q"
    ),
    correctIndex = 1,
    explanation = "Matnda: «ولا يخير طفل والام والجدة احق به حتى يأكل ويشرب ويلبس ويستنجي وحده». O'zi yeb, ichib, kiyinib, istinjo qila olguncha ona haqlidir.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 70-bet"
  ),
  Question(
    id = 190,
    chapterId = "taloq",
    chapterTitle = "Taloq, Idda va Nafaqa kitobi",
    questionText = "Qiz bolani ona qachongacha o'z qaramog'ida saqlaydi?",
    options = listOf(
      "7 yoshgacha",
      "Hayz ko'rguncha (yoki shahvat chegarasiga yetguncha — 9 yoshgacha)",
      "Turmushga chiqqanicha",
      "Chegarasiz"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وبالبنت حتى تحيض... حتى تشتهى». Qiz bola hayz ko'rguncha yoki shahvat paydo bo'lguncha onada qoladi.",
    bookReference = "Muxtasarul Viqoya, Kitobut Taloq, 70-bet"
  ),

  // QASAMLAR (AYMON) VA OZOD QILISH (191 - 200)
  Question(
    id = 191,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Qasam (yamin) Hanafiy fiqhida necha xil bo'ladi?",
    options = listOf(
      "Faqat 1 xil",
      "3 xil: G'amus, Lag'v va Mun'aqida",
      "5 xil",
      "4 xil"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب الايمان: هي ثلث يمين على فعل ماض كاذبا عمدا غموس... او ظانا انه حق وهو ضده لغو... او على آت منعقد». Qasam uch xildir: g'amus, lag'v va mun'aqida.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 79-bet"
  ),
  Question(
    id = 192,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Yaminul g'amus deb qanday qasamga aytiladi?",
    options = listOf(
      "Kelajakdagi ishga ichilgan qasam",
      "O'tmishdagi ishga yolg'on ekanini bila turib qasddan ichilgan yolg'on qasam; bu gunohi kabira bo'lib, unga kafforat yo'q, faqat chin tavba lozim",
      "Xato bilan aytilgan qasam",
      "Ro'za tutish qasami"
    ),
    correctIndex = 1,
    explanation = "Matnda: «غموس يأثم به... وكفر فيه فقط ان حنث ولو سهوا او كرها حلف او حنث». G'amus qasddan yolg'onga ichiladi, uning gunohi juda og'ir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 79-bet"
  ),
  Question(
    id = 193,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Yaminul lag'v deb qanday qasamga aytiladi?",
    options = listOf(
      "Kishi bir ishni to'g'ri deb o'ylab qasam ichsa-yu, aslida aksincha bo'lib chiqsa; bunga gunoh ham, kafforat ham yo'q",
      "Yolg'on qasam",
      "Kafforati bor qasam",
      "Taloq qasami"
    ),
    correctIndex = 0,
    explanation = "Matnda: «او ظانا انه حق وهو ضده لغو يرجى عفوه». To'g'ri deb o'ylab ichilgan qasam lag'v bo'lib, avf etilishi umid qilinadi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 79-bet"
  ),
  Question(
    id = 194,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Qaysi qasam turi buzilganda (hins bo'lganda) kafforat vojib bo'ladi?",
    options = listOf(
      "Yaminul g'amus",
      "Yaminul lag'v",
      "Yaminul mun'aqida (kelajakdagi ishni qilaman yoki qilmayman deb ichilgan qasam)",
      "Hech birida"
    ),
    correctIndex = 2,
    explanation = "Matnda: «او على آت منعقد وكفر فيه فقط ان حنث». Kelajakdagi ishga bog'langan mun'aqida qasami buzilsa kafforat vojib bo'ladi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 79-bet"
  ),
  Question(
    id = 195,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Qasamning kafforati nima?",
    options = listOf(
      "Faqat 1 kun ro'za tutish",
      "Bir qul ozod qilish yoki 10 miskinni to'ydirish yoxud ularni kiyintirish; agar bunga qodir bo'lmasa ketma-ket 3 kun ro'za tutish",
      "Bir yil namoz o'qish",
      "Faqat sadaqa berish"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وكفارته عتق رقبة او اطعام عشرة مساكين... او كسوتهم... فان عجز عنها وقت الاداء صام ثلثة ايام ولاء».",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 80-bet"
  ),
  Question(
    id = 196,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Qasam kafforati uchun ro'za tutishda 3 kun ketma-ket (poydar-pay) bo'lishi shartmi?",
    options = listOf(
      "Yo'q, bo'lib-bo'lib tutsa ham bo'ladi",
      "Ha, ketma-ket (valo') bo'lishi shart, agar orasini uzsa boshidan boshlaydi",
      "Faqat dushanba-payshanba tutiladi",
      "Faqat Ramazonda tutiladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «صام ثلثة ايام ولاء». Qasam kafforati ro'zasi uch kun ketma-ket tutilishi lozim.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 80-bet"
  ),
  Question(
    id = 197,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Alloh taoloning qaysi sifatlari bilan qasam ichish joiz?",
    options = listOf(
      "Maxluqotlar nomi bilan",
      "Allohning ismi (Alloh, Rohman, Rohiym) va zotiy sifatlari (Izzatulloh, Jalolulloh, Qudratulloh)",
      "Otasi yoki boshining haqqi bilan",
      "Ka'ba yoki payg'ambar nomi bilan"
    ),
    correctIndex = 1,
    explanation = "Matnda: «والقسم بالله او باسم من اسمائه كالرحمن والرحيم والحق او بصفة يحلف بها كعزة الله وجلاله وكبريائه... لا بغير الله كالنبي والقرآن والكعبة...».",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 79-80-bet"
  ),
  Question(
    id = 198,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Qasam ichayotib oxirida «Inshaalloh» desa qasam nima bo'ladi?",
    options = listOf(
      "Qasam yanada kuchayadi",
      "Qasam bog'lanmaydi (buzilsa ham kafforat vojib bo'lmaydi)",
      "Kafforati ikki barobar bo'ladi",
      "Gunohkor bo'ladi"
    ),
    correctIndex = 1,
    explanation = "Matnda: «وان وصل ان شاء الله بكلامه بطل». Qasam so'ziga darhol «Inshaalloh»ni ulasa qasam bekor bo'ladi va kafforat tushmaydi.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 80-bet"
  ),
  Question(
    id = 199,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "«Falonday uyga kirmayman» deb qasam ichgan kishi o'sha uyning tomiga chiqsa qasami buziladimi?",
    options = listOf(
      "Ha, uyning tomi ham uy hisoblanadi",
      "Hanafiy urfida buzilmaydi (chunki tomga chiqish uyga kirish deb atalmaydi)",
      "Faqat derazadan kirsa buziladi",
      "Ixtiyoriy"
    ),
    correctIndex = 1,
    explanation = "Matnda: «او وقف على سطحها وقيل في عرفنا لا يحنث». Bizning urfda tomga chiqish bilan qasam buzilmaydi deyilgan.",
    bookReference = "Muxtasarul Viqoya, Kitobul Aymon, 81-bet"
  ),
  Question(
    id = 200,
    chapterId = "aymon",
    chapterTitle = "Qasamlar va Ozod qilish kitobi",
    questionText = "Kitobat (المكاتب) shartnomasi nima?",
    options = listOf(
      "Kitob yozish shartnomasi",
      "Xoja o'z quli bilan ma'lum miqdordagi mablag'ni ishlab to'lash evaziga ozod bo'lishini kelishuvi",
      "Vasiyatnoma yozish",
      "Qarz daftari"
    ),
    correctIndex = 1,
    explanation = "Matnda: «كتاب المكاتب: الكتابة اعتاق المملوك يدا حالا ورقبة مالا فان كاتب قنه... فانت حر...». Qulning ma'lum mablag' evaziga ozodlik sotib olishi kitobatdir.",
    bookReference = "Muxtasarul Viqoya, Kitobul Mukatab, 78-bet"
  )
)
