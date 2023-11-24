import React from 'react';
import { Container, TextField, Button, Box, Link } from '@mui/material';

const Login = () => {
  return (
    <Container
      sx={{
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        height: '100vh',
      }}
    >
      <Box
        sx={{
          width: 400,
          padding: 4,
          borderRadius: 15,
          backgroundColor: '#f0f0f0',
          textAlign: 'center',
          boxShadow: '0px 0px 10px rgba(0, 0, 0, 0.1)',
        }}
      >
        <h2>Login</h2>
        <form>
          <Box sx={{ marginBottom: 2 }}>
            <TextField
              label="Aadhar Card"
              variant="outlined"
              fullWidth
              size="small"
              // Add necessary props and state handling for Aadhar card field
            />
          </Box>
          <Box sx={{ marginBottom: 2 }}>
            <TextField
              type="password"
              label="Password"
              variant="outlined"
              fullWidth
              size="small"
              // Add necessary props and state handling for password field
            />
          </Box>
          <Button variant="contained" color="primary" fullWidth>
            Login
          </Button>
        </form>
        <Box sx={{ marginTop: 2 }}>
          <Link href="/signup" variant="body2">
            Don't have an account? Sign Up
          </Link>
        </Box>
      </Box>
    </Container>
  );
};

export default Login;
