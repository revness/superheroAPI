async function getData() {
  const options = {
    method: "GET",
    headers: {
      accept: "application/json",
      // Authorization:
      //   "Bearer ....",
    },
  };

  const response = fetch(
    "https://akabab.github.io/superhero-api/api/all.json",
    options
  )
    .then((response) => response.json())
    .catch((err) => console.error(err));

  return response;
}

export default async function getSuperheroes() {
  const data = await getData();
  console.log(data);
  return data;
}
