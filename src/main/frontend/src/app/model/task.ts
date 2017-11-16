export class Task {

	public id:number;
	public name:String;
	public completed: boolean;
	public dueDate:string;

	constructor(id:number,name:string,completed:boolean,dueDate:string){
		this.id = id;
		this.name = name;
		this.completed = completed;
		this.dueDate = dueDate;
	}
}
