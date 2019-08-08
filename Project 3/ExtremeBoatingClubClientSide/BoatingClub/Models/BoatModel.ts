import { UserModel } from "./UserModel";
import { SpecialTypeModel } from "./SpecialTypeModel";
    export class BoatModel {

// there can be many specialtypeid to many boats
    boatid: number;
    boatname: string;
    speed: number;
    handleing: number
    turbo: number;
    userid: UserModel;
    specialtypeid: SpecialTypeModel;
    }