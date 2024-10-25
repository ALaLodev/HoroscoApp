package com.example.horoscoapp.motherobject

import com.example.horoscoapp.data.network.response.PredictionResponse
import com.example.horoscoapp.domain.model.HoroscopeInfo.Aquarius
import com.example.horoscoapp.domain.model.HoroscopeInfo.Aries
import com.example.horoscoapp.domain.model.HoroscopeInfo.Cancer
import com.example.horoscoapp.domain.model.HoroscopeInfo.Capricorn
import com.example.horoscoapp.domain.model.HoroscopeInfo.Gemini
import com.example.horoscoapp.domain.model.HoroscopeInfo.Leo
import com.example.horoscoapp.domain.model.HoroscopeInfo.Libra
import com.example.horoscoapp.domain.model.HoroscopeInfo.Pisces
import com.example.horoscoapp.domain.model.HoroscopeInfo.Sagittarius
import com.example.horoscoapp.domain.model.HoroscopeInfo.Scorpio
import com.example.horoscoapp.domain.model.HoroscopeInfo.Taurus
import com.example.horoscoapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse ("date", "horoscope", "sign")

    val horoscopeInfoList = listOf(
        Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
    )
}