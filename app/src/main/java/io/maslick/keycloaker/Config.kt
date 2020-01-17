package io.maslick.keycloaker

object Config {
    const val clientId = "test"
    const val baseUrl = "https://accounts.vimap.vn/auth/realms/smartcodes/protocol/openid-connect"
    const val authenticationCodeUrl = "$baseUrl/auth"
    const val redirectUri = "account://map4d.vn"
}