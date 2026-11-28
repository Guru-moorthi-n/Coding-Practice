import "./App.css";
import React from "react";
import Header from "./Components/Header";

function App() {
  return (
    <div className="main-container">
      <div className="header-container">
        <Header />
      </div>
      <div className="body-container">
        <div className="qr-code-generator">
          <div className="genarator-title">
            <h2>Create QR Code:</h2>
          </div>

          <div className="genarator-div">
            <div className="gen-left">
              <div className="add-content">
                <img src="/number-1.png" alt="number-1" className="numbers" />
                <h2>Add Content</h2>
              </div>
              <div></div>
            </div>
            <div className="gen-right">2</div>
          </div>
        </div>

        <div className="output-box">
          <div className="genarator-title">
            <h2>Output</h2>
          </div>
          <div className="output-body"></div>
        </div>
      </div>
    </div>
  );
}

export default App;