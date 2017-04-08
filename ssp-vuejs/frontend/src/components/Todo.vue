<template>
  <div class="todo">
    <input v-model="newTodo.text">
    <button v-on:click="addNewTodo">add todo</button>
        <transition-group name="list" tag="p">
      <div v-for="item in items" v-bind:key="item" class="list-item">
        <div>{{ item.text }}</div>
      </div>
        </transition-group>
  </div>
</template>

<script>
  import $ from 'jquery'
  const apiURL = 'http://localhost:8080/api/todo'
  export default {
    name: 'todo',
    data () {
      return {
        items: [],
        newTodo: {
          text: 'new ...'
        }
      }
    },
    created: function () {
      this.fetchData()
    },
    methods: {
      fetchData: function () {
//        var self = this
        $.get(apiURL, function (data) {
          console.log(data)
//          self.items = data
        })
      },
      addNewTodo: function () {
        var self = this
        var item = self.newTodo
        console.log(item)
        if (item.text) {
          self.items.push({
            text: item.text
          })
        }

        self.newTodo.text = 'new again ...'
      }
    }

  }
</script>

<style>
    .list-item {
        display: inline-block;
        margin-right: 10px;
    }
    .list-enter-active, .list-leave-active {
        transition: all 1s;
    }
    .list-enter, .list-leave-to /* .list-leave-active for <2.1.8 */ {
        opacity: 0;
        transform: translateY(30px);
    }
</style>
