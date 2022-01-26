package ru.netology.domain;
// информация о комментариях к записи
public class CommentsInfo {
    private int count; //кол-во комментариев
    private int canPost; //инфо о том, может ли текущий пользователь комментировать запись
    private int groupsCanPost; //инфо о том, могут ли сообщества комментировать запись
    private boolean canClose; //может ли тек. пользователь закрыть комменты к записи
    private boolean canOpen; //может ли тек. пользователь открыть комменты к записи
    // + get/set на все поля
}
