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
import androidx.compose.ui.text.font.FontWeight
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
    NavHost(navController = navController, startDestination = "AndroidCompact5") {
        composable("AndroidCompact1") { AndroidCompact1(navController) }
        composable("AndroidCompact2") { AndroidCompact2(navController) }
        composable("AndroidCompact3") { AndroidCompact3(navController) }
        composable("AndroidCompact4") { AndroidCompact4(navController) }
        composable("AndroidCompact5") { AndroidCompact5(navController) }
        composable("AndroidCompact9") { AndroidCompact9(navController) }
        composable("AndroidCompact10") { AndroidCompact10(navController) }
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
@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact1Preview() {
    AndroidCompact1(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact2Preview() {
    AndroidCompact2(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact3Preview() {
    AndroidCompact3(
        navController = rememberNavController(), // Fake NavController để chạy Preview
        modifier = Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact4Preview() {
    val previewNavController = androidx.navigation.compose.rememberNavController() // Tạo NavController giả
    AndroidCompact4(navController = previewNavController, Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact5Preview() {
    val previewNavController = androidx.navigation.compose.rememberNavController() // Tạo NavController giả
    AndroidCompact5(navController = previewNavController, Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact9Preview() {
    val previewNavController = androidx.navigation.compose.rememberNavController() // Tạo NavController giả
    AndroidCompact9(navController = previewNavController, Modifier)
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

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AndroidCompact10Preview() {
    val previewNavController = androidx.navigation.compose.rememberNavController() // Tạo NavController giả
    AndroidCompact10(navController = previewNavController, Modifier)
}