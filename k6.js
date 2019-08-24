import { check } from "k6";
import http from "k6/http";

export let options = {
    vus: 800,
    duration: "100s"
};

export default function() {
    let res = http.get("http://localhost:8080/about");
    check(res, {
        "is status 200": (r) => r.status === 200
});
};
