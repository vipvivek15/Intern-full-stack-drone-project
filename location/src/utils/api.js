export const fetchLocationData = async () => {
  return new Promise((resolve) =>
    setTimeout(() => resolve({ latitude: 37.7749, longitude: -122.4194 }), 1000)
  );
};
