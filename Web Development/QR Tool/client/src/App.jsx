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
                </div>
                
                <div className="qr-code-scanner">
                    <i class="fa fa-arrow-circle-left"></i>
                </div>
            </div>
        </div>
    )
}

export default App;