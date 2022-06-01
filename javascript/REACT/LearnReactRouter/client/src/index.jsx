import ReactDOM from 'react-dom/client';
import {
  BroswerRouter,
  Routes,
  Route,
} from 'react-router-dom';
import App from './components/App.jsx';

const root = ReactDOM.createRoot(
  document.getElementById('root')
);
root.render(
  <BroswerRouter>
    <Routes>
      <Route path="/" element={<App />}>
        <Route path="expenses" element={<Expenses />} />
        <Route path="invoices" element={<Invoices />} />
      </Route>
    </Routes>
  </BroswerRouter>
);