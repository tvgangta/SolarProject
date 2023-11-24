import "./App.css";
import Signup from "./Components/RegLayer/Signup";
import Login from "./Components/RegLayer/Login";
import { Routes, Route, BrowserRouter } from "react-router-dom";
import { Switch } from "@mui/material";
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
