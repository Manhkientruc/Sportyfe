package com.example.sportyfe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.background
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.em
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.foundation.border
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.BorderStroke
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import android.util.Log
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.activity.viewModels
import androidx.navigation.NavController
import com.google.firebase.Firebase
import com.google.firebase.database.database

// Khai báo các FontFamily cho từng kiểu font
val robotoMonoRegular = FontFamily(Font(R.font.robotomono_regular))
val robotoMonoMedium = FontFamily(Font(R.font.robotomono_medium))
val robotoMonoBold = FontFamily(Font(R.font.robotomono_bold))
val robotoMonoLight = FontFamily(Font(R.font.robotomono_light))


class MainActivity : ComponentActivity() {
    private val viewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppNavigation(navController, viewModel)
        }
    }
} //MainActivity không có cái này thì nghỉ, khỏi chạy :)))

@Composable
fun AppNavigation(navController: NavHostController, viewModel: ProductViewModel) {
    NavHost(navController = navController, startDestination = "AndroidCompact36") {
        composable("AndroidCompact1") { AndroidCompact1(navController) }
        composable("AndroidCompact2") { AndroidCompact2(navController) }
        composable("AndroidCompact3") { AndroidCompact3(navController) }
        composable("AndroidCompact4") { AndroidCompact4(navController) }
        composable("AndroidCompact5") { AndroidCompact5(navController) }
        composable("AndroidCompact6") { AndroidCompact6(navController) }
        composable("AndroidCompact8") { AndroidCompact8(navController) }
        composable("AndroidCompact9") { AndroidCompact9(navController) }
        composable("AndroidCompact10") { AndroidCompact10(navController) }
        composable("AndroidCompact11") { AndroidCompact11(navController) }
        composable("AndroidCompact13") { AndroidCompact13(navController) }
        composable("AndroidCompact16") { AndroidCompact16(navController) }
        composable("AndroidCompact24") { AndroidCompact24(navController) }
        composable("AndroidCompact32") { AndroidCompact32(navController) }
        composable("AndroidCompact32_2") { AndroidCompact32_2(navController) }
        composable("AndroidCompact32_3") { AndroidCompact32_3(navController) }
        composable("AndroidCompact32_4") { AndroidCompact32_4(navController) }
        composable("AndroidCompact36") {
            AndroidCompact36(navController, viewModel)
        }
        composable("AndroidCompact40") { AndroidCompact40(navController) }
        composable("AndroidCompact42") { AndroidCompact42(navController) }
        composable("AndroidCompact46") { AndroidCompact46(navController) }
        composable("AndroidCompact47") { AndroidCompact47(navController) }
        composable("AndroidCompact48") { AndroidCompact48(navController) }
        composable("AndroidCompact49") { AndroidCompact49(navController) }
        composable("AndroidCompact50") { AndroidCompact50(navController) }
        composable("AndroidCompact51") { AndroidCompact51(navController) }
        composable("AndroidCompact53") { AndroidCompact53(navController) }
        composable("AndroidCompact54") { AndroidCompact54(navController) }
        composable("AndroidCompact55") { AndroidCompact55(navController) }
        composable("AndroidCompact56") { AndroidCompact56(navController) }
        composable("AndroidCompact57") { AndroidCompact57(navController) }
        composable("AndroidCompact58") { AndroidCompact58(navController) }
        composable("AndroidCompact59") { AndroidCompact59(navController) }
        composable("AndroidCompact60") { AndroidCompact60(navController) }
        composable("AndroidCompact61") { AndroidCompact61(navController) }
        composable("AndroidCompact62") { AndroidCompact62(navController) }
        composable("AndroidCompact63") { AndroidCompact63(navController) }
        composable("AndroidCompact64") { AndroidCompact64(navController) }
        composable("AndroidCompact65") { AndroidCompact65(navController) }
        composable("AndroidCompact67") { AndroidCompact67(navController) }
        composable("AndroidCompact68") { AndroidCompact68(navController) }
        composable("AndroidCompact69") { AndroidCompact69(navController) }
        composable("AndroidCompact70") { AndroidCompact70(navController) }
        composable("AndroidCompact71") { AndroidCompact71(navController) }
        composable("AndroidCompact94") { AndroidCompact94(navController) }
    }
}
data class Product(
    val id: String = "", // Thêm id để track sản phẩm
    val image: Int = 0,
    val price: Long = 0,
    val tittle: String = "",
    var isFavorite: Boolean = false
) //cái này chi tiết sản phẩm từ cơ sở dữ liệu

private val imageMap = mapOf(
/*    821 to R.drawable.img_821,
    822 to R.drawable.img_822,
    823 to R.drawable.img_823,
    100 to R.drawable.ig_100,*/
    101 to R.drawable.ig_101,
    102 to R.drawable.ig_102,
    103 to R.drawable.ig_103,
    /*104 to R.drawable.ig_104,
    105 to R.drawable.ig_105,
    106 to R.drawable.ig_106,
    107 to R.drawable.ig_107,
    108 to R.drawable.ig_108,
    109 to R.drawable.ig_109,
    110 to R.drawable.ig_110,
    111 to R.drawable.ig_111,
    112 to R.drawable.ig_112,
    113 to R.drawable.ig_113,
    114 to R.drawable.ig_114,
    115 to R.drawable.ig_115,
    116 to R.drawable.ig_116,
    117 to R.drawable.ig_117,
    118 to R.drawable.ig_118,
    119 to R.drawable.ig_119,
    120 to R.drawable.ig_120,
    121 to R.drawable.ig_121,
    122 to R.drawable.ig_122,
    123 to R.drawable.ig_123,
    124 to R.drawable.ig_124,
    125 to R.drawable.ig_125,
    126 to R.drawable.ig_126,
    127 to R.drawable.ig_127,
    128 to R.drawable.ig_128,
    129 to R.drawable.ig_129,
    130 to R.drawable.ig_130,
    131 to R.drawable.ig_131,
    132 to R.drawable.ig_132,
    133 to R.drawable.ig_133,
    134 to R.drawable.ig_134,
    135 to R.drawable.ig_135,
    136 to R.drawable.ig_136,
    137 to R.drawable.ig_137,
    138 to R.drawable.ig_138,
    139 to R.drawable.ig_139,
    140 to R.drawable.ig_140,
    141 to R.drawable.ig_141,
    142 to R.drawable.ig_142,
    143 to R.drawable.ig_143,
    144 to R.drawable.ig_144,
    145 to R.drawable.ig_145,
    146 to R.drawable.ig_146,
    147 to R.drawable.ig_147,
    148 to R.drawable.ig_148,
    149 to R.drawable.ig_149,
    150 to R.drawable.ig_150,
    151 to R.drawable.ig_151,
    152 to R.drawable.ig_152,
    153 to R.drawable.ig_153,
    154 to R.drawable.ig_154,
    155 to R.drawable.ig_155,
    156 to R.drawable.ig_156,
    157 to R.drawable.ig_157,
    158 to R.drawable.ig_158,
    159 to R.drawable.ig_159,
    160 to R.drawable.ig_160,
    161 to R.drawable.ig_161,
    162 to R.drawable.ig_162,
    163 to R.drawable.ig_163,
    164 to R.drawable.ig_164,
    165 to R.drawable.ig_165,
    166 to R.drawable.ig_166,
    167 to R.drawable.ig_167,
    168 to R.drawable.ig_168,
    169 to R.drawable.ig_169,
    170 to R.drawable.ig_170,
    171 to R.drawable.ig_171,
    172 to R.drawable.ig_172,
    173 to R.drawable.ig_173,
    174 to R.drawable.ig_174,
    175 to R.drawable.ig_175,
    176 to R.drawable.ig_176,
    177 to R.drawable.ig_177,
    178 to R.drawable.ig_178,
    179 to R.drawable.ig_179,
    180 to R.drawable.ig_180,
    181 to R.drawable.ig_181,
    182 to R.drawable.ig_182,
    183 to R.drawable.ig_183,
    184 to R.drawable.ig_184,
    185 to R.drawable.ig_185,
    186 to R.drawable.ig_186*/
) //cái này là hình ảnh từ cơ sở dữ liệu

@Composable
fun BottomIcon(iconRes: Int, label: String, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onClick() }
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            modifier = Modifier.size(24.dp)
        )
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}
fun Long.formatPrice(): String {
    return "đ ${String.format("%,d", this)}"  // Sẽ format: đ 1,500,000
    // Hoặc
    // return "đ ${DecimalFormat("#,###").format(this)}"  // Sẽ format: đ 1.500.000
}
@Composable
fun ProductCard(
    product: Product,
    viewModel: ProductViewModel,
    imageResId: Int,
    price: Long,
    tittle: String,
    badgeText: String? = null,
    badgeColor: Color = Color.Black,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .width(160.dp)
            .height(200.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Badge hiển thị nếu có
            badgeText?.let {
                Box(
                    modifier = Modifier
                        .background(badgeColor, RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .align(Alignment.Start)
                ) {
                    Text(
                        text = it,
                        color = Color.White,
                        fontSize = 12.sp,
                        fontFamily = robotoMonoBold
                    )
                }
            }

            // Hình ảnh sản phẩm
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
                    .clip(RoundedCornerShape(8.dp))
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = tittle,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize()
                )
            }

            // Giá sản phẩm
            Text(
                text = price.formatPrice(),  // Format price khi hiển thị
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontFamily = robotoMonoMedium,
                    fontSize = 12.sp
                ),
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp)
            )

            // Tên sản phẩm
            Text(
                text = tittle,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = robotoMonoRegular,
                    fontSize = 10.sp
                ),
                color = Color.Gray,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            // Hàng chứa nút tương tác
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(
                        id = if (product.isFavorite) R.drawable.heart_bold else R.drawable.heart
                    ),
                    contentDescription = "Favorite",
                    tint = if (product.isFavorite) Color.Red else Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
                        .clickable { viewModel.toggleFavorite(product) } // Gọi toggleFavorite
                        .padding(4.dp)
                )
                Icon(
                    painter = painterResource(
                        id = if (product.isFavorite) R.drawable.shoppingbag_bold else R.drawable.shoppingbag
                    ),
                    contentDescription = "Add to Cart",
                    modifier = Modifier
                        .size(20.dp)
                        .clickable { viewModel.addToCart(product) }
                        .padding(4.dp)
                )
            }
        }
    }
}

class ProductViewModel : ViewModel() {
    private val database = FirebaseDatabase.getInstance().reference
    private val _products = mutableStateListOf<Product>()
    val products: List<Product> = _products

    private val _favoriteProducts = mutableStateListOf<Product>()
    val favoriteProducts: List<Product> = _favoriteProducts

    init {
        loadProducts()
        loadFavorites()
    }

    private fun loadProducts() {
        database.child("products").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val newProducts = mutableListOf<Product>()
                for (productSnapshot in snapshot.children) {
                    val product = productSnapshot.getValue(Product::class.java)
                    product?.let {
                        // Gán id từ key của Firebase
                        newProducts.add(it.copy(id = productSnapshot.key ?: ""))
                    }
                }
                _products.clear()
                _products.addAll(newProducts)
                // Cập nhật trạng thái favorite
                updateFavoriteStatus()
            }

            override fun onCancelled(error: DatabaseError) {
                // Xử lý lỗi
            }
        })
    }

    private fun loadFavorites() {
        // Giả sử ta lưu favorites trong node "favorites" của user hiện tại
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        database.child("users").child(userId).child("favorites")
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val favoriteIds = snapshot.children.mapNotNull { it.key }
                    Log.d("Favorites", "IDs: $favoriteIds")
                    _favoriteProducts.clear()
                    _favoriteProducts.addAll(_products.filter { it.id in favoriteIds })
                    updateFavoriteStatus()
                }

                override fun onCancelled(error: DatabaseError) {
                    // Xử lý lỗi
                }
            })
    }

    private fun updateFavoriteStatus() {
        _products.forEach { product ->
            product.isFavorite = _favoriteProducts.any { it.id == product.id }
        }
    }

    fun toggleFavorite(product: Product) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        val favoriteRef = database.child("users").child(userId)
            .child("favorites").child(product.id)

        if (product.isFavorite) {
            favoriteRef.removeValue().addOnCompleteListener {
                loadFavorites() // Cập nhật lại danh sách yêu thích
            }
        } else {
            favoriteRef.setValue(true).addOnCompleteListener {
                loadFavorites() // Cập nhật lại danh sách yêu thích
            }
        }
    }
    fun addToCart(product: Product) {
        // Logic thêm sản phẩm vào giỏ hàng
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        database.child("users").child(userId).child("cart").child(product.id.toString())
            .setValue(true)
    }
}

@Composable
fun AndroidCompact1(navController: NavHostController, modifier: Modifier = Modifier) {
    LaunchedEffect(Unit) {
        delay(3000) // Chờ 3 giây
        navController.navigate("AndroidCompact2")
    }
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_44),
            contentDescription = "44 1",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 11.dp,
                    y = (-60.6875).dp)
                .requiredWidth(width = 298.dp)
                .requiredHeight(height = 168.dp))
    }
}

@Composable
fun AndroidCompact2(navController: NavHostController, modifier: Modifier = Modifier) {
    LaunchedEffect(Unit) {
        delay(3000) // Chờ 3 giây
        navController.navigate("AndroidCompact3")
    }
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_44),
            contentDescription = "44 1",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 11.dp,
                    y = (-60.6875).dp)
                .requiredWidth(width = 298.dp)
                .requiredHeight(height = 168.dp))
        Text(
            text = "Đang tải...",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoRegular
            ),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 10.5.dp, y = 292.5.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.line1),
            contentDescription = "Line 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 169.998046875.dp,
                    y = 764.75.dp)
                .requiredWidth(width = 31.dp)
                .border(border = BorderStroke(2.dp, Color.Black)))
    }
}

@Composable
fun AndroidCompact3(navController: NavHostController, modifier: Modifier = Modifier) {
    LaunchedEffect(Unit) {
        delay(3000) // Chờ 3 giây
        navController.navigate("AndroidCompact4")
    }
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Text(
            text = "Chào mừng bạn đến với Sportyfe!\nHãy bắt đầu trải nghiệm mua sắm thú vị, tạo phong cách của riêng bạn cùng Sportyfe.  ",
            color = Color.Black,
            lineHeight = 1.71.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoRegular
            ),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 7.5.dp,
                    y = (-43.5).dp)
                .requiredWidth(width = 339.dp)
                .requiredHeight(height = 88.dp))
    }
}

@Composable
fun AndroidCompact4(navController: NavHostController, modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val database = FirebaseDatabase.getInstance().reference
    val auth = FirebaseAuth.getInstance()

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Logo
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 50.dp)
                .size(width = 295.dp, height = 166.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 230.dp)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Đăng nhập",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = robotoMonoMedium,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            InputField(
                value = email,
                onValueChange = { email = it },
                label = "E-mail"
            )
            InputField(
                value = password,
                onValueChange = { password = it },
                label = "Mật khẩu",
                isPassword = true
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { isChecked = it },
                        colors = CheckboxDefaults.colors(Color.Black)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Nhớ mật khẩu",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoLight,
                            color = Color.Black
                        )
                    )
                }

                Text(
                    text = "Quên mật khẩu?",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = robotoMonoBold,
                        color = Color.Black,
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.clickable { navController.navigate("AndroidCompact6") }
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Căn giữa nút Đăng nhập
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        if (email.isNotEmpty() && password.isNotEmpty()) {
                            auth.signInWithEmailAndPassword(email, password)
                                .addOnCompleteListener { task ->
                                    if (task.isSuccessful) {
                                        // Lấy ID của user hiện tại
                                        val userId = auth.currentUser?.uid

                                        // Kiểm tra thông tin user trong database
                                        database.child("users").child(userId ?: "")
                                            .addListenerForSingleValueEvent(object : ValueEventListener {
                                                override fun onDataChange(snapshot: DataSnapshot) {
                                                    if (snapshot.exists()) {
                                                        // User đã tồn tại trong database
                                                        Toast.makeText(
                                                            context,
                                                            "Đăng nhập thành công!",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                        navController.navigate("AndroidCompact32")
                                                    } else {
                                                        // Tạo user mới trong database
                                                        val userData = mapOf(
                                                            "email" to email,
                                                            "password" to password  // Lưu ý: Trong thực tế không nên lưu password trực tiếp
                                                        )
                                                        database.child("users").child(userId ?: "").setValue(userData)
                                                            .addOnSuccessListener {
                                                                Toast.makeText(
                                                                    context,
                                                                    "Đăng nhập thành công!",
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                                navController.navigate("AndroidCompact32")
                                                            }
                                                            .addOnFailureListener { e ->
                                                                Toast.makeText(
                                                                    context,
                                                                    "Lỗi: ${e.message}",
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                            }
                                                    }
                                                }

                                                override fun onCancelled(error: DatabaseError) {
                                                    Toast.makeText(
                                                        context,
                                                        "Lỗi database: ${error.message}",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            })
                                    } else {
                                        Toast.makeText(
                                            context,
                                            "Đăng nhập thất bại: ${task.exception?.message}",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                }
                        } else {
                            Toast.makeText(
                                context,
                                "Vui lòng điền đầy đủ thông tin",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp),
                    shape = RoundedCornerShape(30.dp)
                ) {
                    Text(
                        text = "Đăng nhập",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = robotoMonoMedium
                        )
                    )
                }
            }

            // Căn giữa phần còn lại
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Đăng nhập với",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = robotoMonoBold,
                        color = Color.Black
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    IconButton(onClick = { /* Handle Facebook login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.fb),
                            contentDescription = "Facebook",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle Google login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.gg),
                            contentDescription = "Google",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle Apple login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.ap),
                            contentDescription = "Apple",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Bạn chưa có tài khoản? ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoLight,
                            color = Color.Black
                        )
                    )
                    Text(
                        text = "Đăng ký",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoBold,
                            color = Color(0xFF2106F3)
                        ),
                        modifier = Modifier.clickable { navController.navigate("AndroidCompact5") }
                    )
                }
            }
        }
    }
}
@Composable
private fun InputField(value: String, onValueChange: (String) -> Unit, label: String, isPassword: Boolean = false, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp),
        singleLine = true,
        shape = RoundedCornerShape(20.dp),
        textStyle = TextStyle(fontSize = 14.sp),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}

@Composable
fun AndroidCompact5(navController: NavHostController, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Logo
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 50.dp)
                .size(width = 295.dp, height = 166.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 200.dp)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Đăng ký",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = robotoMonoMedium,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(5.dp))

            InputField5(
                value = email,
                onValueChange = { email = it },
                label = "E-mail"
            )
            InputField5(
                value = password,
                onValueChange = { password = it },
                label = "Mật khẩu",
                isPassword = true
            )
            InputField5(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = "Nhập lại mật khẩu",
                isPassword = true
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp) // Thêm padding để căn chỉnh với checkbox
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { isChecked = it },
                        colors = CheckboxDefaults.colors(Color.Black)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Tôi đồng ý với ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoLight,
                            color = Color.Black
                        )
                    )
                    Text(
                        text = "điều khoản dịch vụ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoBold,
                            color = Color.Blue
                        ),
                        modifier = Modifier.clickable { navController.navigate("AndroidCompact9") }
                    )
                }

                Row(
                    modifier = Modifier.padding(start = 110.dp)
                ) {
                    Text(
                        text = "cùng ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoLight,
                            color = Color.Black
                        )
                    )
                    Text(
                        text = "chính sách bảo mật",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoBold,
                            color = Color.Blue
                        ),
                        modifier = Modifier.clickable { navController.navigate("AndroidCompact10") }
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Căn giữa nút Đăng ký
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                            if (password == confirmPassword) {
                                if (isChecked) {
                                    val auth = FirebaseAuth.getInstance()
                                    val database = FirebaseDatabase.getInstance().reference

                                    auth.createUserWithEmailAndPassword(email, password)
                                        .addOnCompleteListener { task ->
                                            if (task.isSuccessful) {
                                                // Tạo tài khoản thành công
                                                val userId = auth.currentUser?.uid

                                                // Lưu thêm thông tin vào database (nếu cần)
                                                val userData = mapOf(
                                                    "email" to email,
                                                    "uid" to userId
                                                )

                                                database.child("users").child(userId ?: "").setValue(userData)
                                                    .addOnSuccessListener {
                                                        Toast.makeText(
                                                            context,
                                                            "Đăng ký thành công!",
                                                            Toast.LENGTH_SHORT
                                                        ).show()

                                                        // Điều hướng sang màn hình khác
                                                        navController.navigate("AndroidCompact32")
                                                    }
                                                    .addOnFailureListener { e ->
                                                        Toast.makeText(
                                                            context,
                                                            "Lỗi lưu dữ liệu: ${e.message}",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                    }
                                            } else {
                                                Toast.makeText(
                                                    context,
                                                    "Đăng ký thất bại: ${task.exception?.message}",
                                                    Toast.LENGTH_SHORT
                                                ).show()
                                            }
                                        }
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Bạn cần đồng ý với điều khoản dịch vụ và chính sách bảo mật.",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            } else {
                                Toast.makeText(
                                    context,
                                    "Mật khẩu và xác nhận mật khẩu không khớp.",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        } else {
                            Toast.makeText(
                                context,
                                "Vui lòng điền đầy đủ thông tin.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Đăng ký",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = robotoMonoMedium
                        )
                    )
                }
            }

            // Căn giữa phần còn lại
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Đăng nhập với",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = robotoMonoBold,
                        color = Color.Black
                    )
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    IconButton(onClick = { /* Handle Facebook login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.fb),
                            contentDescription = "Facebook",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle Google login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.gg),
                            contentDescription = "Google",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle Apple login */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.ap),
                            contentDescription = "Apple",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Bạn đã có tài khoản? ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoLight,
                            color = Color.Black
                        )
                    )
                    Text(
                        text = "Đăng nhập",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = robotoMonoBold,
                            color = Color.Blue
                        ),
                        modifier = Modifier.clickable { navController.navigate("AndroidCompact4") }
                    )
                }
            }
        }
    }
}
@Composable
fun InputField5(value: String, onValueChange: (String) -> Unit, label: String, isPassword: Boolean = false, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp),
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
        textStyle = TextStyle(fontSize = 14.sp),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}

@Composable
fun AndroidCompact6(navController: NavHostController, modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Logo
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 50.dp)
                .size(width = 295.dp, height = 166.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 230.dp)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Quên mật khẩu",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = robotoMonoMedium,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Vui lòng nhập email của bạn để nhận hướng dẫn đặt lại mật khẩu",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = robotoMonoLight,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            InputField(
                value = email,
                onValueChange = { email = it },
                label = "E-mail"
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nút Gửi yêu cầu
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /* Handle gửi yêu cầu */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp),
                    shape = RoundedCornerShape(30.dp)
                ) {
                    Text(
                        text = "Gửi yêu cầu",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = robotoMonoMedium
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Quay lại đăng nhập
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Quay lại ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = robotoMonoLight,
                        color = Color.Black
                    )
                )
                Text(
                    text = "Đăng nhập",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = robotoMonoBold,
                        color = Color(0xFF2106F3)
                    ),
                    modifier = Modifier.clickable { navController.navigateUp() }
                )
            }
        }
    }
}
@Composable
private fun InputField(value: String, onValueChange: (String) -> Unit, label: String, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp),
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
        textStyle = TextStyle(fontSize = 14.sp)
    )
}

@Composable
fun AndroidCompact9(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Text(
            lineHeight = 2.sp,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("1. Giới thiệu")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n1.1 Ứng dụng Sportyfe là một nền tảng trực tuyến\n\n\n\n\n\n\n\n\n\nđược [Sportyfe] phát triển và cung cấp các dịch vụ \n\n\n\n\n\n\n\n\n\nliên quan đến thể thao, bao gồm [theo dõi hoạt động,\n\n\n\n\n\n\n\n\n\ntham gia cộng đồng, mua sắm sản phẩm thể thao...].\n\n\n\n\n\n\n\n\n\n1.2 Việc sử dụng Ứng dụng đồng nghĩa với việc bạn đã\n\n\n\n\n\n\n\n\n\nđọc,hiểu và đồng ý tuân thủ đầy đủ các điều khoản này.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n2. Quyền sử dụng")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n2.1 Chúng tôi cấp cho bạn quyền sử dụng không\n\n\n\n\n\n\n\n\n\nđộc quyền để truy cập và sử dụng Ứng dụng.\n\n\n\n\n\n\n\n\n\n2.2 Bạn đồng ý không sử dụng Ứng dụng cho mục đích\n\n\n\n\n\n\n\n\n\nbất hợp pháp, vi phạm quyền sở hữu trí tuệ của\n\n\n\n\n\n\n\n\n\nchúng tôi hoặc của bên thứ ba.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n3. Tài khoản người dùng")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n3.1 Bạn cần tạo một tài khoản để sử dụng đầy đủ các\n\n\n\n\n\n\n\n\n\ntính năng của Ứng dụng.\n\n\n\n\n\n\n\n\n\n3.2 Bạn phải chịu trách nhiệm bảo mật thông tin\n\n\n\n\n\n\n\n\n\ntài khoản của mình.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n4. Quyền sở hữu trí tuệ")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n4.1 Tất cả nội dung trên Ứng dụng, bao gồm nhưng\n\n\n\n\n\n\n\n\n\nkhông giới hạn ở văn bản, hình ảnh, logo, đều là\n\n\n\n\n\n\n\n\n\ntài sản trí tuệ của chúng tôi.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n5. Nội dung người dùng")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n5.1 Bạn có thể tạo và chia sẻ nội dung trên Ứng dụng.\n\n\n\n\n\n\n\n\n\n5.2 Bạn chịu trách nhiệm về nội dung mình tạo ra.\n\n\n\n\n\n\n\n\n\n5.3 Chúng tôi có quyền xóa bỏ bất kỳ nội dung nào\n\n\n\n\n\n\n\n\n\nvi phạm Điều khoản này.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n6. Thanh toán (nếu có)")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n6.1 Chúng tôi cung cấp các hình thức thanh toán.\n\n\n\n\n\n\n\n\n\n6.2 Chính sách hoàn tiền được quy định chi tiết trong\n\n\n\n\n\n\n\n\n\nChính sách Hoàn tiền.\n\n\n\n\n\n\n\n\n\n6.3 Hóa đơn điện tử sẽ được gửi đến email của bạn.")}},
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (15).dp,
                    y = 0.dp)
                .requiredWidth(width = 337.dp))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 110.dp)
                .requiredWidth(width = 10.dp)
                .requiredHeight(height = 16.dp)
                .clickable {
                    navController.navigate("AndroidCompact5")
                }
        )
        Text(
            text = "Điều khoản dịch vụ",
            color = Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (0).dp,
                    y = 110.dp))
    }
}

@Composable
fun AndroidCompact10(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Text(
            lineHeight = 2.sp,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("1. Mục đích thu thập thông tin")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n1.1 Chúng tôi thu thập thông tin của bạn để cung cấp\n\n\n\n\n\n\n\n\n\ndịch vụ, cá nhân hóa trải nghiệm, và thực hiện các\n\n\n\n\n\n\n\n\n\nhoạt động kinh doanh.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n2. Các loại thông tin thu thập")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n2.1 Thông tin cá nhân: Tên, email, số điện thoại...\n\n\n\n\n\n\n\n\n\n2.2 Dữ liệu sức khỏe: Chiều cao, cân nặng, nhịp tim...\n\n\n\n\n\n\n\n\n\n2.3 Thông tin về thiết bị: Loại thiết bị,\n\n\n\n\n\n\n\n\n\nhệ điều hành...")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n3. Cách sử dụng thông tin")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n3.1 Cung cấp dịch vụ\n\n\n\n\n\n\n\n\n\n3.2 Cá nhân hóa trải nghiệm\n\n\n\n\n\n\n\n\n\n3.3 Tiếp thị\n\n\n\n\n\n\n\n\n\n3.4 Phân tích dữ liệu")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n4. Chia sẻ thông tin")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n4.1 Chúng tôi có thể chia sẻ thông tin của bạn với\n\n\n\n\n\n\n\n\n\ncác đối tác tin cậy để cung cấp dịch vụ.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n5. Bảo mật thông tin")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n5.1 Chúng tôi áp dụng các biện pháp bảo mật để\n\n\n\n\n\n\n\n\n\nbảo vệ thông tin của bạn.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n6. Quyền của bạn")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n6.1 Bạn có quyền truy cập, sửa đổi và xóa thông tin\n\n\n\n\n\n\n\n\n\ncá nhân của mình.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n7. Lưu trữ dữ liệu")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n7.1 Chúng tôi sẽ lưu trữ dữ liệu của bạn trong \n\n\n\n\n\n\n\n\n\nthời gian cần thiết để cung cấp dịch vụ\n\n\n\n\n\n\n\n\n\nvà tuân thủ pháp luật.")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("\n\n\n\n\n\n\n\n\n\n8. Sự cố bảo mật")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("\n\n\n\n\n\n\n\n\n\n8.1 Nếu xảy ra sự cố bảo mật, chúng tôi sẽ thông báo\n\n\n\n\n\n\n\n\n\ncho bạn và thực hiện các biện pháp khắc phục.")}},
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (15).dp,
                    y = (0).dp)
                .requiredWidth(width = 337.dp))
        Text(
            text = "Đội ngũ Sportyfe.",
            color = Color.Black,
            lineHeight = 14.4.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoBold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 110.dp,
                    y = 310.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 110.dp)
                .requiredWidth(width = 10.dp)
                .requiredHeight(height = 16.dp)
                .clickable {
                    navController.navigate("AndroidCompact5")
                }
        )
        Text(
            text = "Chính sách bảo mật",
            color = Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (0).dp,
                    y = 110.dp))
    }
}

@Composable
fun AndroidCompact11(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "45",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-95).dp,
                    y = (-350).dp)
                .requiredWidth(width = 134.dp)
                .requiredHeight(height = 31.dp))
        Image(
            painter = painterResource(id = R.drawable.search),
            contentDescription = "Interface essential/Magnifier",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 120.dp,
                    y = (-350).dp)
                .requiredSize(size = 25.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 160.dp,
                    y = (-350).dp)
                .requiredSize(size = 28.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(5.dp)))
        Image(
            painter = painterResource(id = R.drawable.qr),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 160.dp,
                    y = (-350).dp)
                .requiredWidth(width = 19.dp)
                .requiredHeight(height = 22.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 186.dp,
                    y = 822.dp)
                .requiredSize(size = 35.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.magnifier),
            contentDescription = "Interface essential/Magnifier",
            colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.25f)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 120.dp,
                    y = 780.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "Icon",
            colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.25f)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 192.dp,
                    y = 780.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.shoppingbag),
            contentDescription = "Comercial/Shopping-bag",
            colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.25f)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 268.dp,
                    y = 780.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.person),
            contentDescription = "User/Person",
            colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.25f)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 338.dp,
                    y = 780.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = "Icon",
            colorFilter = ColorFilter.tint(Color(0xff000000)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 48.dp,
                    y = 780.dp)
                .requiredSize(size = 25.dp))
        Text(
            text = "Đang tải sản phẩm...",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.5.dp,
                    y = (-60.5).dp))
        Image(
            painter = painterResource(id = R.drawable.line2),
            contentDescription = "Line 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 122.dp,
                    y = 413.dp)
                .requiredWidth(width = 31.dp)
                .border(border = BorderStroke(2.dp, Color.Black)))
        Divider(
            color = Color.Black.copy(alpha = 0.15f),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 765.dp)
                .requiredWidth(width = 412.dp)
                .graphicsLayer(rotationZ = 0.14f))
        Divider(
            color = Color.Black.copy(alpha = 0.15f),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 135.dp)
                .requiredWidth(width = 412.dp)
                .graphicsLayer(rotationZ = 0.14f))
    }
}

@Composable
fun TopBar(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .height(60.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "Sportyfe Logo",
            modifier = Modifier.size(150.dp)
        )
        Row {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search",
                modifier = Modifier
                    .size(36.dp)
                    .padding(end = 16.dp)
                    .clickable {
                        navController.navigate("AndroidCompact13")
                    }
            )
            Icon(
                painter = painterResource(id = R.drawable.qr),
                contentDescription = "QR Code",
                modifier = Modifier.size(36.dp).padding(end = 16.dp).clickable {navController.navigate("androidCompact8")}
            )
        }
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Nền trắng
            .height(60.dp) // Độ cao của thanh dưới
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Các icon trang chủ, tìm kiếm, yêu thích, giỏ hàng, cá nhân
        BottomIcon(R.drawable.home, "") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "") {
            navController.navigate("AndroidCompact13")
        }
        BottomIcon(R.drawable.heart, "") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "") {
            navController.navigate("AndroidCompact24")
        }
    }
}

@Composable
fun BottomBar2(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Nền trắng
            .height(60.dp) // Độ cao của thanh dưới
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Các icon trang chủ, tìm kiếm, yêu thích, giỏ hàng, cá nhân
        BottomIcon(R.drawable.home_light, "") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.search, "") {
            navController.navigate("AndroidCompact13")
        }
        BottomIcon(R.drawable.heart, "") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "") {
            navController.navigate("AndroidCompact24")
        }
    }
}

@Composable
fun BottomBar3(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Nền trắng
            .height(60.dp) // Độ cao của thanh dưới
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Các icon trang chủ, tìm kiếm, yêu thích, giỏ hàng, cá nhân
        BottomIcon(R.drawable.home_light, "") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "") {
            navController.navigate("AndroidCompact13")
        }
        BottomIcon(R.drawable.heart_bold, "") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "") {
            navController.navigate("AndroidCompact24")
        }
    }
}

@Composable
fun BottomBar4(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Nền trắng
            .height(60.dp) // Độ cao của thanh dưới
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Các icon trang chủ, tìm kiếm, yêu thích, giỏ hàng, cá nhân
        BottomIcon(R.drawable.home_light, "") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "") {
            navController.navigate("AndroidCompact13")
        }
        BottomIcon(R.drawable.heart, "") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag_bold, "") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "") {
            navController.navigate("AndroidCompact24")
        }
    }
}

@Composable
fun BottomBar5(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Nền trắng
            .height(60.dp) // Độ cao của thanh dưới
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Các icon trang chủ, tìm kiếm, yêu thích, giỏ hàng, cá nhân
        BottomIcon(R.drawable.home_light, "") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "") {
            navController.navigate("AndroidCompact13")
        }
        BottomIcon(R.drawable.heart, "") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person_bold, "") {
            navController.navigate("AndroidCompact24")
        }
    }
}

@Composable
fun AndroidCompact32(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Text(
                            text = "Hàng mới về",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium),
                        )
                        Text(
                            text = "Best Seller",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoBold, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_2")
                                }
                        )
                        Text(
                            text = "Nam",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_3")
                                }
                        )
                        Text(
                            text = "Nữ",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_4")
                                }
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                product = product,
                                viewModel = viewModel,
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                badgeText = "NEW",
                                badgeColor = Color.Black,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact32_2(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },     // Thanh trên cố định
        bottomBar = { BottomBar(navController) } // Thanh dưới cố định
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // Chừa khoảng trống cho topBar và bottomBar
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Text(
                            text = "Hàng mới về",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32")
                                }

                        )
                        Text(
                            text = "Best Seller",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoBold)
                        )
                        Text(
                            text = "Nam",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_3")
                                }
                        )
                        Text(
                            text = "Nữ",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_4")
                                }
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                badgeText = "🔥",
                                badgeColor = Color(0xCBFFC0CB),
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact32_3(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Text(
                            text = "Hàng mới về",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32")
                                }

                        )
                        Text(
                            text = "Best Seller",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoBold, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_2")
                                }
                        )
                        Text(
                            text = "Nam",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium),
                        )
                        Text(
                            text = "Nữ",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_4")
                                }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate ("AndroidCompact59")}
                    ) {
                        Text(
                            text = "ÁO - NAM",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 24.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate ("AndroidCompact71")}
                    ) {
                        Text(
                            text = "GIÀY - NAM",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 24.dp, y = 12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact59(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact32_3")
                                }
                        )
                        Text(
                            text = "NAM - ÁO",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact70")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.all_men_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "TẤT CẢ CÁC ÁO CHO NAM",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact60")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.polo_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO PHÔNG/ÁO POLO",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact67")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.hoodies_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO THUN/ÁO HOODIES",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact68")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.training_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO TẬP LUYỆN",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact69")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.jacket),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO KHOÁC",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact60(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                        Text(
                            text = "NAM - ÁO - ÁO PHÔNG/ÁO POLO",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact94(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - TẤT CẢ SẢN PHẨM",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact67(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                        Text(
                            text = "NAM - ÁO - ÁO THUN/ÁO HOODIES",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact68(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                        Text(
                            text = "NAM - ÁO - ÁO TẬP LUYỆN",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 32.dp))
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact69(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                        Text(
                            text = "NAM - ÁO - ÁO KHOÁC",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact70(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact59")
                                }
                        )
                        Text(
                            text = "NAM - ÁO - TẤT CẢ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact71(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact32_3")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact94")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.all_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "TẤT CẢ GIÀY DÀNH CHO NAM",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact61")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.original_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY ORIGINALS",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact62")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.running_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY CHẠY BỘ",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact63")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.training_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY TẬP LUYỆN/ĐÁ BÓNG",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact65")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sandal),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "DÉP/DÉP XỎ NGÓN",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact32_4(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Text(
                            text = "Hàng mới về",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32")
                                }

                        )
                        Text(
                            text = "Best Seller",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoBold, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_2")
                                }
                        )
                        Text(
                            text = "Nam",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("androidCompact32_3")
                                }
                        )
                        Text(
                            text = "Nữ",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("androidCompact42")}
                    ) {
                        Text(
                            text = "ÁO - NỮ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 24.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("androidCompact46")}
                    ) {
                        Text(
                            text = "GIÀY - NỮ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 24.dp, y = 12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact42(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact32_4")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact51")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.all_women_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "TẤT CẢ CÁC ÁO CHO NỮ",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact47")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_t_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO PHÔNG/ÁO SƠ MI",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact48")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_hoodies_shirt),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO THUN/ÁO HOODIES",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact49")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.croptop),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO TẬP/ÁO CROPTOP",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact50")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_jacket),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ÁO KHOÁC",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact46(navController: NavHostController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact32_4")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact58")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.all_women_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "TẤT CẢ GIÀY DÀNH CHO NỮ",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact53")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.original_women_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY ORIGINALS",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact54")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_running_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY CHẠY BỘ",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact55")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_training_shoe),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "GIÀY TẬP LUYỆN",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{navController.navigate("AndroidCompact57")}
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.women_sandal),
                                contentDescription = "Icon",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "DÉP/DÉP XỎ NGÓN",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoMedium
                                ),
                                color = Color.Black,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact36(navController: NavHostController, viewModel: ProductViewModel) {

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar3(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "Arrow",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier
                            .requiredWidth(10.dp)
                            .requiredHeight(16.dp)
                            .clickable { navController.navigate("androidCompact32") }
                    )
                    Text(
                        text = "Danh sách yêu thích",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontFamily = robotoMonoMedium,
                            color = Color.Black,
                            fontSize = 12.sp
                        )
                    )
                }
                Spacer(modifier = Modifier.height(200.dp))

                if (viewModel.favoriteProducts.isEmpty()) {
                    // Hiển thị khi không có sản phẩm yêu thích
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = "Chưa lưu mặt hàng",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black
                            )
                        )
                        Text(
                            text = "Nhấp vào biểu tượng trái tim để lưu các mặt hàng",
                            style = MaterialTheme.typography.bodySmall.copy(
                                fontFamily = robotoMonoRegular,
                                color = Color.Black,
                                fontSize = 10.sp
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(
                            modifier = Modifier
                                .wrapContentWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.Black)
                                .padding(horizontal = 16.dp, vertical = 8.dp)
                                .clickable { navController.navigate("androidCompact32") }
                        ) {
                            Text(
                                text = "Bắt đầu mua sắm",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontFamily = robotoMonoBold,
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }
                } else {
                    // Hiển thị danh sách sản phẩm yêu thích
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(1),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(viewModel.favoriteProducts) { product ->
                            ProductCard(
                                product = product,
                                viewModel = viewModel,
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact16(navController: NavHostController) {
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
    Scaffold(
        topBar = { TopBar(navController) },     // Thanh trên cố định
        bottomBar = { BottomBar4(navController) } // Thanh dưới cố định
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // Chừa khoảng trống cho topBar và bottomBar
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(0.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Giỏ hàng",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black
                            )
                        )
                        Box(
                            contentAlignment = Alignment.Center // Căn giữa các phần tử trong Box
                        ) {
                            // Hình ảnh Cart Empty ở dưới
                            Image(
                                painter = painterResource(id = R.drawable.cart_empty),
                                contentDescription = "Empty Cart Image",
                                modifier = Modifier
                                    .size(240.dp)
                                    .padding(vertical = 16.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.img_45),
                                contentDescription = "Overlay Image",
                                modifier = Modifier
                                    .size(80.dp)
                                    .offset(y = 20.dp)
                            )
                        }
                        Text(
                            text = "Giỏ hàng của bạn đang trống",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black
                            )
                        )
                        Text(
                            text = "Hãy mua hàng ngày thôi!",
                            style = MaterialTheme.typography.bodySmall.copy(
                                fontFamily = robotoMonoRegular,
                                color = Color.Black,
                                fontSize = 10.sp
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .wrapContentWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Black)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Tìm kiếm trong cửa hàng",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.White,
                                fontSize = 12.sp
                            ),
                            modifier = Modifier.align(Alignment.Center).clickable{navController.navigate("androidCompact32")}
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .wrapContentWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Black)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Tìm kiếm danh sách yêu thích",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.White,
                                fontSize = 12.sp
                            ),
                            modifier = Modifier.align(Alignment.Center).clickable{navController.navigate("androidCompact36")}
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

enum class SelectedTab {
    VIDEO, PHOTO, PANORAMA
}

@Composable
fun AndroidCompact8(navController: NavHostController, modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(SelectedTab.PHOTO) }
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Spacer(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 329.dp,
                    y = 319.dp)
                .requiredSize(size = 100.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 59.dp)
                .requiredWidth(width = 412.dp)
                .requiredHeight(height = 645.dp)
                .background(color = Color(0xfff3f3f3))
        ) {
            Image(
                painter = painterResource(id = R.drawable.qr_code_example1),
                contentDescription = "qr_code_example 1",
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .requiredSize(size = 350.dp))
            Image(
                painter = painterResource(id = R.drawable.img_45),
                contentDescription = "logo",
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(y = 5.dp)
                    .requiredSize(size = 120.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.camerarotatesolid1),
            contentDescription = "camera-rotate-solid 1",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 296.dp, y = 768.dp)
                .requiredWidth(width = 30.dp)
                .requiredHeight(height = 27.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.imageregular1),
            contentDescription = "image-regular 1",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 67.dp,
                    end = 300.dp,
                    top = 768.dp,
                    bottom = 124.dp
                )
        )

        Image(
            painter = painterResource(id = R.drawable.circleregular),
            contentDescription = "circle-regular",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp, y = 320.dp)
                .requiredSize(size = 60.dp)
        )
        Text(
            text = "Video",
            color = if (selectedTab == SelectedTab.VIDEO) Color(0xff258ada) else Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp, y = 704.dp)
                .requiredWidth(width = 65.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable { selectedTab = SelectedTab.VIDEO }
        )

        Text(
            text = "Toàn cảnh",
            color = if (selectedTab == SelectedTab.PANORAMA) Color(0xff258ada) else Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 279.dp, y = 704.dp)
                .requiredWidth(width = 112.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable { selectedTab = SelectedTab.PANORAMA }
        )

        Text(
            text = "Ảnh",
            color = if (selectedTab == SelectedTab.PHOTO) Color(0xff258ada) else Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 190.dp, y = 706.dp)
                .requiredWidth(width = 37.dp)
                .requiredHeight(height = 25.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable { selectedTab = SelectedTab.PHOTO }
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
                    .offset(y = 32.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "Arrow",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier
                            .requiredWidth(10.dp)
                            .requiredHeight(16.dp)
                            .clickable {
                                navController.navigate("androidCompact32")
                            }
                    )
                }
            }
        }
    }
}

@Composable
fun AndroidCompact13(navController: NavHostController, modifier: Modifier = Modifier) {
    val searchHistory = listOf(
        "Giày",
        "Dịch vụ khách hàng",
        "Quần áo",
        "Áo khoác",
        "Túi xách",
        "Mũ",
        "Khăn choàng",
        "Giày thể thao",
        "Giày cao gót",
        "Thắt lưng"
    )
    Scaffold(
        bottomBar = { BottomBar2(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Box(
                            modifier = modifier
                                .requiredWidth(width = 250.dp)
                                .requiredHeight(height = 40.dp)
                                .clip(shape = RoundedCornerShape(100.dp))
                                .background(color = Color(0xffe6e6e6))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.camera),
                                contentDescription = "Interface essential/Camera",
                                colorFilter = ColorFilter.tint(Color.Black),
                                modifier = Modifier
                                    .align(alignment = Alignment.Center)
                                    .offset(x = 100.dp,
                                        y = 0.dp)
                                    .requiredSize(size = 20.dp))
                            Text(
                                text = "Tìm sản phẩm...",
                                color = Color(0xff000000),
                                lineHeight = 9.em,
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = robotoMonoMedium),
                                modifier = modifier
                                    .align(alignment = Alignment.Center)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "Interface essential/Magnifier",
                                modifier = Modifier
                                    .align(alignment = Alignment.Center)
                                    .offset(x = -100.dp,
                                        y = 0.dp)
                                    .requiredSize(size = 20.dp))
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Box(
                            modifier = modifier
                                .requiredSize(size = 35.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color(0xffe6e6e6))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.qr),
                                contentDescription = "qr_code_example 2",
                                modifier = Modifier
                                    .align(alignment = Alignment.Center)
                                    .requiredSize(size = 25.dp)
                                    .clip(shape = RoundedCornerShape(6.dp)))
                        }
                    }
                    Spacer(modifier = Modifier.height(200.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(0.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                    }
                    Box(
                        modifier = Modifier
                            .wrapContentWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Black)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Đã xem gần đây",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.White,
                                fontSize = 16.sp
                            ),
                            modifier = Modifier.align(Alignment.Center).clickable{navController.navigate("androidCompact40")}
                        )
                    }
                    Spacer(modifier = Modifier.height(300.dp))
                    Box (
                        modifier = modifier
                            .requiredSize(size = 412.dp)
                            .background(color = Color(0xffe6e6e6))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 30.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Lịch sử tìm kiếm...",
                                    style = MaterialTheme.typography.bodyMedium.copy(fontFamily = robotoMonoBold)
                                )
                                Text(
                                    text = "Xóa tất cả",
                                    style = MaterialTheme.typography.bodyMedium.copy(fontFamily = robotoMonoBold, color = Color.Red),
                                    modifier = Modifier.clickable { /* Xử lý xóa tất cả */ }
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                                    .clip(RoundedCornerShape(12.dp))
                            ) {
                                items(searchHistory) { item ->
                                    SearchHistoryItem(item)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SearchHistoryItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .clip(RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.search),
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = Color.Black
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun AndroidCompact24(navController: NavHostController, modifier: Modifier = Modifier) {
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
    Scaffold(
        bottomBar = { BottomBar5(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // Chừa khoảng trống cho topBar và bottomBar
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 40.dp, end = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.customerrembg1),
                            contentDescription = "customer",
                            modifier = modifier
                                .requiredSize(size = 50.dp))
                        Text(
                            text = "ali123@gmail.com",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            lineHeight = 9.em,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = robotoMonoBold),
                            modifier = modifier
                                .requiredWidth(width = 194.dp)
                                .requiredHeight(height = 35.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Spacer(modifier = Modifier.width(10.dp))
                        Image(
                            painter = painterResource(id = R.drawable.emai1),
                            contentDescription = "Interface essential/emai-1",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = modifier
                                .requiredSize(size = 30.dp)
                                .clickable{}
                        )
                    }
                }
                Spacer(modifier = Modifier.height(50.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{}
                    ) {
                        Text(
                            text = "Chỉnh sửa trang cá nhân",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 12.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{}
                    ) {
                        Text(
                            text = "Chờ giao hàng",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 12.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{}
                    ) {
                        Text(
                            text = "Lịch sử mua hàng",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 12.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{}
                    ) {
                        Text(
                            text = "Đổi mật khẩu",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 12.dp, y = 12.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(1.dp, Color.Gray)
                            .clickable{}
                    ) {
                        Text(
                            text = "Đăng xuất/Chuyển tài khoản",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoMedium
                            ),
                            color = Color.Red,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 12.dp, y = 12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact40(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar2(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("androidCompact13")
                                }
                        )
                        Text(
                            text = "Đã xem gần đây",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun AndroidCompact58(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - TẤT CẢ SẢN PHẨM",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact57(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - DÉP/DÉP XỎ NGÓN",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact56(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - GIÀY SNEAKER",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact55(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - GIÀY TẬP LUYỆN",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact54(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - GIÀY CHẠY BỘ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact53(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact46")
                                }
                        )
                        Text(
                            text = "NỮ - GIÀY - ORIGINALS",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact51(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact42")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO - TẤT CẢ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact50(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact42")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO - ÁO KHOÁC",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact48(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact42")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO - ÁO THUN/ÁO HOODIES",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact49(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact42")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO - ÁO TẬP/ÁO CROPTOP",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact47(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact42")
                                }
                        )
                        Text(
                            text = "NỮ - ÁO - ÁO PHÔNG/ÁO SƠ MI",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.filter),
                            contentDescription = "Interface essential/Filter",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredSize(size = 25.dp)
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact61(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - GIÀY ORIGINALS",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact62(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - GIÀY CHẠY BỘ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact63(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - GIÀY TẬP LUYỆN/GIÀY ĐÁ BÓNG",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact64(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - GIÀY SNEAKER",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact65(navController: NavHostController) {
    val viewModel: ProductViewModel = viewModel()
    val products = remember { mutableStateOf(emptyList<Product>()) }

    LaunchedEffect(Unit) {
        val database = FirebaseDatabase.getInstance().getReference("products")
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val productList = mutableListOf<Product>()
                for (child in snapshot.children) {
                    try {
                        val priceValue = child.child("price").getValue(Long::class.java) ?: 0L
                        val image = child.child("image").getValue(Int::class.java) ?: 0
                        val tittle = child.child("tittle").getValue(String::class.java) ?: ""

                        // Ánh xạ image từ số sang drawable
                        val drawableResId = imageMap[image]
                        if (drawableResId != null) {
                            productList.add(
                                Product(
                                    image = drawableResId,
                                    price = priceValue,
                                    tittle = tittle
                                )
                            )
                            Log.d("FirebaseFetch", "Added product: tittle=$tittle, Price=$priceValue")
                        } else {
                            Log.d("FirebaseFetch", "Drawable not found for image: $image")
                        }
                    } catch (e: Exception) {
                        Log.e("FirebaseFetch", "Error parsing product: ${e.message}")
                    }
                }

                products.value = productList
                Log.d("FirebaseFetch", "Total products fetched: ${productList.size}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseFetch", "Failed to fetch data: ${error.message}")
            }
        })
    }

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vector),
                            contentDescription = "Arrow",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .requiredWidth(10.dp)
                                .requiredHeight(16.dp)
                                .clickable {
                                    navController.navigate("AndroidCompact71")
                                }
                        )
                        Text(
                            text = "NAM - GIÀY - DÉP/DÉP XỎ NGÓN",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
                Box {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.value.size) { index ->
                            val product = products.value[index]
                            ProductCard(
                                imageResId = product.image,
                                price = product.price,
                                tittle = product.tittle,
                                product = product,
                                viewModel = viewModel,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact65Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact65(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact64Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact64(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact63Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact63(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact62Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact62(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact61Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact61(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact47Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact47(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact48Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact48(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact49Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact49(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact50Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact50(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact51Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact51(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact53Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact53(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact54Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact54(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact55Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact55(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact56Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact56(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact57Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact57(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact58Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact58(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact1Preview() {
    AndroidCompact1(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact2Preview() {
    AndroidCompact2(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact3Preview() {
    AndroidCompact3(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact4Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact4(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact5Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact5(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact6Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact6(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact9Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact9(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact10Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact10(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact11Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact11(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact32(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_2Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact32_2(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_3Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact32_3(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_4Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact32_4(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact36Preview() {
    val previewNavController = rememberNavController()
    val previewViewModel = ProductViewModel() // Khởi tạo một instance của ViewModel
    AndroidCompact36(navController = previewNavController, viewModel = previewViewModel)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact16Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact16(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact8Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact16(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact13Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact13(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact24Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact24(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact40Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact40(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact59Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact59(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact71Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact71(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact42Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact42(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact46Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact46(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact60Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact60(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact67Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact67(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact68Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact68(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact69Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact69(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact70Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact70(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact94Preview() {
    val previewNavController = rememberNavController()
    AndroidCompact94(navController = previewNavController)
}