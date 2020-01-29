(ns cljs-hack.core
  (:require [reagent.core :as r]))

(def hello-world-div
  [:div [:p "Hello world!"]])

(r/render hello-world-div
          (js/document.getElementById "app"))