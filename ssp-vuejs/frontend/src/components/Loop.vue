<template>
  <div class="loop">
    <input v-model="newTodo.text">
    <button v-on:click="addNewTodo">add todo</button>
    <ol>
      <li v-for="todo in items">
        <div>{{ todo.text }}</div>
      </li>
    </ol>
  </div>
</template>

<script>
  import $ from 'jquery'
  const apiURL = 'http://localhost:8080/api/todo'
  export default {
    name: 'loop',
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
          console.log('hahahaha')
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

</style>
