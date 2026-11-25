import './App.css';
import React from 'react';
import Header from './Components/Header';

function App() {
    return (
        <div className="main-container">
            <div className="header-container">
                <Header/>
            </div>
            <div className="body-container">
                <div className="qr-code-generator">
                    <div className="genarator-title">
                    <h2>Create QR Code:</h2>
                    </div>

                    <div className="genarator-div">
                        <div className="gen-left">1</div>
                        <div className="gen-right">2</div>
                    </div>
                </div>
                
                <div className="qr-code-scanner">
                    <i className="fa fa-arrow-circle-left left-arrow"></i>
                </div>
            </div>
        </div>
    )
}

export default App;