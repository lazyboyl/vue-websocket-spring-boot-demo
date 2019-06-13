<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
  </div>
</template>

<script>
import io from 'socket.io-client'

export default {
  name: 'App',
  mounted () {
    let _this = this
    let opts = {
      query: 'loginUser=linzf'
    }
    let socket = io.connect('http://127.0.0.1:9099', opts)
    socket.on('connect', function () {
      console.log('连接成功')
    })
    socket.on('push_event', function (data) {
      console.log(data)
    })
    socket.on('disconnect', function () {
      console.log('已经下线')
    })
  }
}
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
