import { BoatModel } from "./BoatModel";

export class UserModel {
    userid: number;
    username: string;
    firstname: string;
    lastname: string;
    password: string;
    money: number;
    wins: number;
    level: number;
    experience: number;
    List<MembershipModel> membershipid;
    boatid: BoatModel;
    List<InsuranceModel> insuranceid;

    constructor(userid = 0, username = '', firstname = '', lastname = '', password = '', money = 0, wins = 0, level = 0, experience = 0, boatid: BoatModel) {
        this.userid = userid;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.money = money;
        this.wins = wins;
        this.experience = experience;
        this.boatid = boatid;

    }

}