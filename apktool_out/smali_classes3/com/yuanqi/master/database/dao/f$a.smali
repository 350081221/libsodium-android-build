.class Lcom/yuanqi/master/database/dao/f$a;
.super Landroidx/room/EntityInsertionAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/dao/f;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lv2/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/master/database/dao/f;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/dao/f;Landroidx/room/RoomDatabase;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/dao/f$a;->a:Lcom/yuanqi/master/database/dao/f;

    invoke-direct {p0, p2}, Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method protected a(Landroidx/sqlite/db/SupportSQLiteStatement;Lv2/c;)V
    .locals 3
    .param p1    # Landroidx/sqlite/db/SupportSQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lv2/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lv2/c;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lv2/c;->k()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Lv2/c;->k()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p2}, Lv2/c;->o()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x3

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p2}, Lv2/c;->o()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-virtual {p2}, Lv2/c;->j()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v1, 0x4

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {p2}, Lv2/c;->j()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    const/4 v0, 0x5

    .line 65
    invoke-virtual {p2}, Lv2/c;->m()D

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x6

    .line 73
    invoke-virtual {p2}, Lv2/c;->n()D

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$a;->a:Lcom/yuanqi/master/database/dao/f;

    .line 81
    .line 82
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->d(Lcom/yuanqi/master/database/dao/f;)Lcom/yuanqi/master/tools/c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p2}, Lv2/c;->p()Ljava/util/Date;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {v0, p2}, Lcom/yuanqi/master/tools/c;->a(Ljava/util/Date;)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/4 v0, 0x7

    .line 95
    if-nez p2, :cond_3

    .line 96
    .line 97
    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v1

    .line 105
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 106
    .line 107
    .line 108
    :goto_3
    return-void
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method protected bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Landroidx/sqlite/db/SupportSQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lv2/c;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/database/dao/f$a;->a(Landroidx/sqlite/db/SupportSQLiteStatement;Lv2/c;)V

    return-void
.end method

.method protected createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR IGNORE INTO `history` (`id`,`app_name`,`package_name`,`address`,`latitude`,`longitude`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)"

    return-object v0
.end method
