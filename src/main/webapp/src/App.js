import React, {Component} from 'react';
import './App.css';
import axios from "axios";

class App extends Component {


  sendRequest = () => {
    axios.post("http://localhost:8080/addPeople",[
      {
        "isim": "fatih",
        "soyisim": "doğmuş",
        "age": 26
      },
      {
        "isim": "hebele",
        "soyisim": "hubele",
        "age": 24
      },
      {
        "isim": "ahmet",
        "soyisim": "mehmet",
        "age": 31
      }
    ]).then(function (response) {
      console.log(response.data)
    })
  }

  render() {
    return (
      <div className="App">
        <button onClick={this.sendRequest}>Click Me!</button>
      </div>
    );
  }
}

export default App;
