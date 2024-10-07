"use client";
import { useQuery } from "@tanstack/react-query";
import getSuperheroes from "./api/getSuperheroes";

export default function Home() {
  const { data, isLoading, isError } = useQuery({
    queryFn: getSuperheroes,
    queryKey: ["superheroes"], //Array according to Documentation
  });

  if (isLoading) return <div>Loading..</div>;
  if (isError) return <div>Sorry There was an Error</div>;
  return (
    <>
      <div className="grid grid-cols-4 gap-4 p-10 text-white">
        {data?.map((superhero: { id: number; name: string }) => {
          return (
            <div key={superhero.id}>
              {superhero.id}
              {superhero.name}
            </div>
          );
        })}
      </div>
    </>
  );
}
