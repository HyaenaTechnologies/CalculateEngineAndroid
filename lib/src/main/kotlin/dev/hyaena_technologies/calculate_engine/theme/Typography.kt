package dev.hyaena_technologies.calculate_engine.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import dev.hyaena_technologies.calculate_engine.R

// Font Provider
val provider: GoogleFont.Provider = GoogleFont.Provider(
    certificates = R.array.com_google_android_gms_fonts_certs,
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms"
)

// Body Font Family
val bodyFontFamily: FontFamily = FontFamily(
    Font(
        fontProvider = provider,
        googleFont = GoogleFont("Red Hat Display"),
    )
)

// Display Font Family
val displayFontFamily: FontFamily = FontFamily(
    Font(
        fontProvider = provider,
        googleFont = GoogleFont("JetBrains Mono"),
    )
)

// Baseline Typography
val baseline: Typography = Typography()

// Calculate Engine Typography
val calculateEngineTypography: Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
)
