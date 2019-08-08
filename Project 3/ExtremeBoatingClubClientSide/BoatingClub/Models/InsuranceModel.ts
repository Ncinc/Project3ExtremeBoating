import { UserModel } from "./UserModel";
 export class InsuranceModel {

    insuranceid: number;
    insurancecoverage: string;
    userid: UserModel;

    constructor(insuranceid = 0, insurancecoverage = '',  userid: UserModel ){

    }
 }