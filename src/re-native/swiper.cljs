(ns re-native.swiper
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-swiper (js/require "react-native-swiper"))

(def Swiper react-native-swiper)

(assert react-native-swiper)
(assert Swiper)

(def swiper (r/adapt-react-class Swiper))
