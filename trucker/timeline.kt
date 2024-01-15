package com.example.trucker

import androidx.appcompat.app.AppCompatActivity
import twitter4j.Paging
import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder
import twitter4j.Status

// transformar na timeline usando a API do Twitter
class timeline : AppCompatActivity() {
    val configuration = ConfigurationBuilder()
        .setDebugEnabled(true)
        .setOAuthConsumerKey("gOQAm7DyqHL0FBiqv8mC3zMkI")
        .setOAuthConsumerSecret("vAk8EjpTKy38cn4Ki2dsi7DE3Qm7GrfmHSG56wZRv42i3zTH81")
        .setOAuthAccessToken("1172311537995997185-4TJ5zyQAwZk4TsAnSsz5LGb2khj1XC")
        .setOAuthAccessTokenSecret("T0RbTCpxA3WEFPYJDCLSEkkJkvvcgEE4Kf6IlIBGXxVoN")
        .build()

    // Crie uma instância do Twitter
    val twitter = TwitterFactory(configuration).instance

    // Especifique o número de tweets que você deseja obter por página
    val paging = Paging(1, 10) // Exemplo: Obtém os 10 tweets mais recentes

    // Obtenha o timeline do usuário autenticado
    // val timeline = twitter.getHomeTimeline(paging)
}