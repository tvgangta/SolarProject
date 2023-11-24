import React from 'react';
import { Container, TextField, Button, Box, FormControlLabel, Radio, RadioGroup, Link } from '@mui/material';

const Signup = () => {
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
        <h2>Sign Up</h2>
        <form>
          <Box sx={{ marginBottom: 2 }}>
            <TextField
              label="Username"
              variant="outlined"
              fullWidth
              size="small"
              // Add necessary props and state handling for username field
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
          <Box sx={{ marginBottom: 2 }}>
            <TextField
              label="Aadhar Card Number"
              variant="outlined"
              fullWidth
              size="small"
              // Add necessary props and state handling for Aadhar card number field
            />
          </Box>
          <Box sx={{ marginBottom: 2 }}>
            <RadioGroup defaultValue="consumer" row>
              <FormControlLabel value="consumer" control={<Radio />} label="Consumer" />
              <FormControlLabel value="prosumer" control={<Radio />} label="Prosumer" />
            </RadioGroup>
          </Box>
          <Button variant="contained" color="primary" fullWidth>
            Sign Up
          </Button>
        </form>
      </Box>
    </Container>
  );
};

export default Signup;
