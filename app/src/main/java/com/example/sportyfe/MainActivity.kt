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
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import com.google.firebase.Firebase
import com.google.firebase.database.database

// Khai báo các FontFamily cho từng kiểu font
val robotoMonoRegular = FontFamily(Font(R.font.robotomono_regular))
val robotoMonoMedium = FontFamily(Font(R.font.robotomono_medium))
val robotoMonoBold = FontFamily(Font(R.font.robotomono_bold))
val robotoMonoLight = FontFamily(Font(R.font.robotomono_light))


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppNavigation(navController)
        }
    }
}

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "AndroidCompact36") {
        composable("AndroidCompact1") { AndroidCompact1(navController) }
        composable("AndroidCompact2") { AndroidCompact2(navController) }
        composable("AndroidCompact3") { AndroidCompact3(navController) }
        composable("AndroidCompact4") { AndroidCompact4(navController) }
        composable("AndroidCompact5") { AndroidCompact5(navController) }
        composable("AndroidCompact8") { AndroidCompact8(navController) }
        composable("AndroidCompact9") { AndroidCompact9(navController) }
        composable("AndroidCompact10") { AndroidCompact10(navController) }
        composable("AndroidCompact11") { AndroidCompact11(navController) }
        composable("AndroidCompact16") { AndroidCompact16(navController) }
        composable("AndroidCompact32") { AndroidCompact32(navController) }
        composable("AndroidCompact32_2") { AndroidCompact32_2(navController) }
        composable("AndroidCompact32_3") { AndroidCompact32_3(navController) }
        composable("AndroidCompact32_4") { AndroidCompact32_4(navController) }
        composable("AndroidCompact36") { AndroidCompact36(navController) }
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
    var isChecked by remember { mutableStateOf(false) }
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
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 10.5.dp,
                    y = (-248.53125).dp)
                .requiredWidth(width = 295.dp)
                .requiredHeight(height = 166.dp))
        Text(
            text = "Đăng nhập",
            color = Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoBold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-106.5).dp,
                    y = (-115.5).dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Nhớ mật khẩu",
            color = Color.Black,
            lineHeight = 14.4.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-90.5).dp,
                    y = 34.5.dp))
        Image(
            painter = painterResource(
                id = if (isChecked) R.drawable.squarechecksolid1 else R.drawable.squarechecksolid),
            contentDescription = if (isChecked) "Checked" else "Unchecked",
            colorFilter = ColorFilter.tint(if (isChecked) Color.Black else Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp, y = 487.dp)
                .requiredSize(size = 12.dp)
                .clickable {
                    isChecked = !isChecked // Đổi trạng thái khi bấm
                }
        )
        Text(
            text = "Quên mật khẩu?",
            color = Color.Black,
            textDecoration = TextDecoration.Underline,
            lineHeight = 14.4.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoBold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 110.5.dp,
                    y = 34.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Đăng nhập với",
            color = Color.Black,
            lineHeight = 14.4.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoBold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.5029296875.dp,
                    y = 194.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 10.sp,
                        fontFamily = robotoMonoBold
                    )
                ) { append("Bạn chưa có tài khoản?         ") }
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-20).dp, y = 283.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )

        Text(
            text = "Đăng ký",
            color = Color(0xff2106f3),
            fontSize = 10.sp,
            fontFamily = robotoMonoBold,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (60).dp, y = 283.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable {
                    navController.navigate("AndroidCompact5") // Chuyển sang AndroidCompact5
                }
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 3.5.dp,
                    y = (-66.5).dp)
                .requiredWidth(width = 309.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.5.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 131.5.dp)
                .requiredWidth(width = 214.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.Black))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 3.5.dp,
                    y = (-3.5).dp)
                .requiredWidth(width = 309.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.5.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        Image(
            painter = painterResource(id = R.drawable.line1),
            contentDescription = "Line 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 163.dp,
                    y = 639.5059204101562.dp)
                .requiredWidth(width = 86.dp)
                .border(border = BorderStroke(2.dp, Color.Black)))
        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 137.dp,
                    y = 683.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.gg),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 192.dp,
                    y = 683.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 26.dp))
        Image(
            painter = painterResource(id = R.drawable.ap),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 249.dp,
                    y = 676.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 33.dp))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 110.dp)
                .requiredWidth(width = 10.dp)
                .requiredHeight(height = 16.dp))
        Text(
            text = "E-mail",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-91).dp,
                    y = (-3.5).dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 144.dp))
        Text(
            text = "Mật khẩu",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-91).dp,
                    y = (60).dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 144.dp))
        Text(
            text = "Đăng nhập",
            color = Color.White,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (7).dp,
                    y = (175).dp)
                .requiredWidth(width = 87.dp)
                .requiredHeight(height = 105.dp))
    }
}

@Composable
fun AndroidCompact5(navController: NavHostController, modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }
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
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 10.5.dp,
                    y = (-250.53125).dp)
                .requiredWidth(width = 295.dp)
                .requiredHeight(height = 166.dp)
        )
        Text(
            text = "Đăng ký",
            color = Color.Black,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-116).dp,
                    y = (-144.5).dp))
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 10.sp,
                        fontFamily = robotoMonoLight
                    )
                ) { append("     Tôi đồng ý với ") }
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = -100.dp, y = 63.5.dp)
        )
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("điều khoản dịch vụ")}
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 12.dp, y = 63.5.dp)
                .clickable {
                    navController.navigate("AndroidCompact9")
                }
        )
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoLight)) {append("và ")}
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = -50.dp, y = 75.5.dp)
        )
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontFamily = robotoMonoBold)) {append("chính sách bảo mật")}
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 12.dp, y = 75.5.dp)
                .clickable {
                    navController.navigate("AndroidCompact10")
                }
        )
        Image(
            painter = painterResource(
                id = if (isChecked) R.drawable.squarechecksolid1 else R.drawable.squarechecksolid),
            contentDescription = if (isChecked) "Checked" else "Unchecked",
            colorFilter = ColorFilter.tint(if (isChecked) Color.Black else Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 55.dp, y = 516.dp)
                .requiredSize(size = 12.dp)
                .clickable {
                    isChecked = !isChecked // Đổi trạng thái khi bấm
                }
        )
        Text(
            text = "Đăng nhập với",
            color = Color.Black,
            lineHeight = 14.4.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoBold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 202.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            lineHeight = 14.sp,
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 10.sp,
                        fontFamily = robotoMonoBold
                    )
                ) { append("Bạn đã có tài khoản?       ") }
            },
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-20).dp, y = 283.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            text = "Đăng nhập",
            color = Color(0xff2106f3),
            fontSize = 10.sp,
            fontFamily = robotoMonoBold,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (60).dp, y = 283.5.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable {
                    navController.navigate("AndroidCompact4") // Chuyển sang AndroidCompact4
                }
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 3.5.dp,
                    y = (-95.5).dp)
                .requiredWidth(width = 309.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.5.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 139.5.dp)
                .requiredWidth(width = 214.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.Black))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 3.5.dp,
                    y = (-32.5).dp)
                .requiredWidth(width = 309.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.5.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 3.5.dp,
                    y = 30.5.dp)
                .requiredWidth(width = 309.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(1.5.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        Text(
            text = "Đăng ký",
            color = Color.White,
            textAlign = TextAlign.Center,
            lineHeight = 9.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoMonoMedium),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 139.5.dp)
                .requiredWidth(width = 87.dp)
                .requiredHeight(height = 144.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.line1),
            contentDescription = "Line 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 163.dp,
                    y = 647.5059204101562.dp)
                .requiredWidth(width = 86.dp)
                .border(border = BorderStroke(2.dp, Color.Black)))
        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 137.dp,
                    y = 683.dp)
                .requiredSize(size = 25.dp))
        Image(
            painter = painterResource(id = R.drawable.gg),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 192.dp,
                    y = 683.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 26.dp))
        Image(
            painter = painterResource(id = R.drawable.ap),
            contentDescription = "Frame",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 249.dp,
                    y = 676.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 33.dp))
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
                    navController.navigate("AndroidCompact4") // Chuyển sang AndroidCompact4
                }
        )
        Spacer(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 334.dp,
                    y = 257.dp)
                .requiredSize(size = 100.dp))
        Text(
            text = "E-mail",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-92).dp,
                    y = (-31.5).dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 144.dp))
        Text(
            text = "Mật khẩu",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-91).dp,
                    y = (31.5).dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 144.dp))
        Text(
            text = "Nhập lại mật khẩu",
            color = Color.Black,
            lineHeight = 10.29.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontFamily = robotoMonoLight),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (-50).dp,
                    y = 77.dp)
                .requiredWidth(width = 158.dp)
                .requiredHeight(height = 109.dp))
    }
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
            .background(Color.White) // Thanh trên nền trắng
            .height(60.dp), // Độ cao của thanh trên
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Logo SPORTYFE
        Image(
            painter = painterResource(id = R.drawable.img_45),
            contentDescription = "Sportyfe Logo",
            modifier = Modifier.size(150.dp)
        )
        Row {
            // Icon tìm kiếm
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search",
                modifier = Modifier
                    .size(36.dp)
                    .padding(end = 16.dp)
            )
            // Icon QR
            Icon(
                painter = painterResource(id = R.drawable.qr), // Thêm icon QR vào drawable
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
        BottomIcon(R.drawable.home, "Home") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "Search") {
            navController.navigate("#")
        }
        BottomIcon(R.drawable.heart, "Favorites") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "Cart") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "Profile") {
            navController.navigate("#")
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
        BottomIcon(R.drawable.home_light, "Home") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.search, "Search") {
            navController.navigate("#")
        }
        BottomIcon(R.drawable.heart, "Favorites") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "Cart") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "Profile") {
            navController.navigate("#")
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
        BottomIcon(R.drawable.home_light, "Home") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "Search") {
            navController.navigate("#") // Chuyển đến AndroidCompact36
        }
        BottomIcon(R.drawable.heart_bold, "Favorites") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag, "Cart") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "Profile") {
            navController.navigate("#")
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
        BottomIcon(R.drawable.home_light, "Home") {
            navController.navigate("AndroidCompact32")
        }
        BottomIcon(R.drawable.magnifier, "Search") {
            navController.navigate("#") // Chuyển đến AndroidCompact36
        }
        BottomIcon(R.drawable.heart, "Favorites") {
            navController.navigate("AndroidCompact36")
        }
        BottomIcon(R.drawable.shoppingbag_bold, "Cart") {
            navController.navigate("AndroidCompact16")
        }
        BottomIcon(R.drawable.person, "Profile") {
            navController.navigate("#")
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
        BottomIcon(R.drawable.home_light, "Home") {
            navController.navigate("AndroidCompact32") // Chuyển đến AndroidCompact32
        }
        BottomIcon(R.drawable.magnifier, "Search") {
            navController.navigate("#") // Chuyển đến AndroidCompact36
        }
        BottomIcon(R.drawable.heart, "Favorites") {
            navController.navigate("AndroidCompact36") // Chuyển đến AndroidCompact35
        }
        BottomIcon(R.drawable.shoppingbag, "Cart") {
            navController.navigate("AndroidCompact16") // Chuyển đến AndroidCompact37
        }
        BottomIcon(R.drawable.person_bold, "Profile") {
            navController.navigate("#") // Chuyển đến AndroidCompact38
        }
    }
}

@Composable
fun AndroidCompact32(navController: NavHostController) {
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
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
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium),
                        )
                        Text(
                            text = "Best Seller",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoBold, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    // Điều hướng đến AndroidCompact33 khi bấm
                                    navController.navigate("androidCompact32_2")
                                }
                        )
                        Text(
                            text = "Nam",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    // Điều hướng đến AndroidCompact33 khi bấm
                                    navController.navigate("androidCompact32_3")
                                }
                        )
                        Text(
                            text = "Nữ",
                            style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium, color = Color.Gray),
                            modifier = Modifier
                                .clickable {
                                    // Điều hướng đến AndroidCompact33 khi bấm
                                    navController.navigate("androidCompact32_4")
                                }
                        )
                    }
                }
                Box (){
                    val products = listOf(
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                    )
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.size) { index ->
                            ProductCard(
                                imageResId = products[index].first,
                                price = products[index].second,
                                title = products[index].third,
                                badgeText = "NEW", // Nhãn hiển thị
                                badgeColor = Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BottomIcon(iconRes: Int, label: String, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onClick() } // Thêm sự kiện click
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            modifier = Modifier.size(24.dp) // Kích thước icon
        )
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}

@Composable
fun ProductCard(imageResId: Int, price: String, title: String,badgeText: String? = null,badgeColor: Color = Color.Black) {
    // Card hiển thị thông tin sản phẩm
    Card(
        modifier = Modifier
            .padding(5.dp)
            .width(160.dp) // Chiều rộng cố định cho card
            .height(225.dp), // Chiều cao cố định cho card
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f) // Giữ tỷ lệ hình ảnh
                    .clip(RoundedCornerShape(8.dp))
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = title,
                    contentScale = ContentScale.Fit, // Giữ nguyên tỷ lệ hình ảnh
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = price,
                style = MaterialTheme.typography.bodyLarge.copy(fontFamily = robotoMonoMedium,fontSize = 12.sp),
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = title,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = robotoMonoRegular,fontSize = 8.sp
                ),
                color = Color.Gray,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.shoppingbag),
                    contentDescription = "Add to Cart",
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Favorite",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun AndroidCompact32_2(navController: NavHostController) {
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
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
                Box (){
                    val products = listOf(
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                    )
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.size) { index ->
                            ProductCard(
                                imageResId = products[index].first,
                                price = products[index].second,
                                title = products[index].third,
                                badgeText = "🔥",
                                badgeColor = Color(0xCBFFC0CB)
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
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
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
                Box (){
                    val products = listOf(
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_171, "đ 2.000.000", "[NAM] \nGiày thể thao Oceanfire"),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_177, "đ 1.500.000", "[NAM] \nÁo Hoodie CrossSight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_175, "đ 2.000.000", "[NAM] \nÁo Hoodie CrossMight "),
                        Triple(R.drawable.img_172, "đ 2.000.000", "[NAM] \nGiày thể thao Volabyss"),
                    )
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.size) { index ->
                            ProductCard(
                                imageResId = products[index].first,
                                price = products[index].second,
                                title = products[index].third,
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
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
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
                Box (){
                    val products = listOf(
                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),
                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),                        Triple(R.drawable.img_172, "đ 3.000.000", "[NỮ] \nGiày thể thao SweButter"),
                        Triple(R.drawable.img_173, "đ 3.000.000", "[NỮ] \nGiày thể thao Crechesse"),
                        Triple(R.drawable.img_179, "đ 3.000.000", "[NỮ] \nÁo Hoodies Pullover "),
                    )
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        items(products.size) { index ->
                            ProductCard(
                                imageResId = products[index].first,
                                price = products[index].second,
                                title = products[index].third,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AndroidCompact36(navController: NavHostController, modifier: Modifier = Modifier) {
    // Sử dụng Scaffold để tạo cấu trúc thanh trên, thanh dưới và nội dung giữa
    Scaffold(
        topBar = { TopBar(navController) },     // Thanh trên cố định
        bottomBar = { BottomBar3(navController) } // Thanh dưới cố định
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
                        Text(
                            text = "Danh sách yêu thích",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontFamily = robotoMonoMedium,
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
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
                                fontSize = 10.sp // Giảm kích cỡ chữ
                            )
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
                            .clickable {navController.navigate("androidCompact32")}
                    ) {
                        Text(
                            text = "Bắt đầu mua sắm",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontFamily = robotoMonoBold,
                                color = Color.White,
                                fontSize = 12.sp
                            ),
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun AndroidCompact16(navController: NavHostController, modifier: Modifier = Modifier) {
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
                        verticalArrangement = Arrangement.spacedBy(8.dp),
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
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact4(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact5Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact5(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact9Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact9(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact10Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact10(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact11Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact11(navController = previewNavController, Modifier)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact32(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_2Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact32_2(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_3Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact32_3(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact32_4Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact32_4(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact36Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact36(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 1283)
@Composable
private fun AndroidCompact16Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact16(navController = previewNavController)
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact8Preview() {
    val previewNavController = rememberNavController() // Tạo NavController giả
    AndroidCompact16(navController = previewNavController)
}