.class public final Lcom/google/gson/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/gson/internal/d;

.field private b:Lcom/google/gson/w;

.field private c:Lcom/google/gson/e;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/gson/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/y;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/y;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/google/gson/internal/d;->h:Lcom/google/gson/internal/d;

    iput-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 3
    sget-object v0, Lcom/google/gson/w;->DEFAULT:Lcom/google/gson/w;

    iput-object v0, p0, Lcom/google/gson/g;->b:Lcom/google/gson/w;

    .line 4
    sget-object v0, Lcom/google/gson/d;->IDENTITY:Lcom/google/gson/d;

    iput-object v0, p0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/g;->d:Ljava/util/Map;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/g;->f:Ljava/util/List;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/gson/g;->g:Z

    const/4 v1, 0x2

    .line 9
    iput v1, p0, Lcom/google/gson/g;->i:I

    .line 10
    iput v1, p0, Lcom/google/gson/g;->j:I

    .line 11
    iput-boolean v0, p0, Lcom/google/gson/g;->k:Z

    .line 12
    iput-boolean v0, p0, Lcom/google/gson/g;->l:Z

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lcom/google/gson/g;->m:Z

    .line 14
    iput-boolean v0, p0, Lcom/google/gson/g;->n:Z

    .line 15
    iput-boolean v0, p0, Lcom/google/gson/g;->o:Z

    .line 16
    iput-boolean v0, p0, Lcom/google/gson/g;->p:Z

    return-void
.end method

.method constructor <init>(Lcom/google/gson/f;)V
    .locals 5

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-object v0, Lcom/google/gson/internal/d;->h:Lcom/google/gson/internal/d;

    iput-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 19
    sget-object v0, Lcom/google/gson/w;->DEFAULT:Lcom/google/gson/w;

    iput-object v0, p0, Lcom/google/gson/g;->b:Lcom/google/gson/w;

    .line 20
    sget-object v0, Lcom/google/gson/d;->IDENTITY:Lcom/google/gson/d;

    iput-object v0, p0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/g;->d:Ljava/util/Map;

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/google/gson/g;->f:Ljava/util/List;

    const/4 v3, 0x0

    .line 24
    iput-boolean v3, p0, Lcom/google/gson/g;->g:Z

    const/4 v4, 0x2

    .line 25
    iput v4, p0, Lcom/google/gson/g;->i:I

    .line 26
    iput v4, p0, Lcom/google/gson/g;->j:I

    .line 27
    iput-boolean v3, p0, Lcom/google/gson/g;->k:Z

    .line 28
    iput-boolean v3, p0, Lcom/google/gson/g;->l:Z

    const/4 v4, 0x1

    .line 29
    iput-boolean v4, p0, Lcom/google/gson/g;->m:Z

    .line 30
    iput-boolean v3, p0, Lcom/google/gson/g;->n:Z

    .line 31
    iput-boolean v3, p0, Lcom/google/gson/g;->o:Z

    .line 32
    iput-boolean v3, p0, Lcom/google/gson/g;->p:Z

    .line 33
    iget-object v3, p1, Lcom/google/gson/f;->f:Lcom/google/gson/internal/d;

    iput-object v3, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 34
    iget-object v3, p1, Lcom/google/gson/f;->g:Lcom/google/gson/e;

    iput-object v3, p0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    .line 35
    iget-object v3, p1, Lcom/google/gson/f;->h:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 36
    iget-boolean v0, p1, Lcom/google/gson/f;->i:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->g:Z

    .line 37
    iget-boolean v0, p1, Lcom/google/gson/f;->j:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->k:Z

    .line 38
    iget-boolean v0, p1, Lcom/google/gson/f;->k:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->o:Z

    .line 39
    iget-boolean v0, p1, Lcom/google/gson/f;->l:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->m:Z

    .line 40
    iget-boolean v0, p1, Lcom/google/gson/f;->m:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->n:Z

    .line 41
    iget-boolean v0, p1, Lcom/google/gson/f;->n:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->p:Z

    .line 42
    iget-boolean v0, p1, Lcom/google/gson/f;->o:Z

    iput-boolean v0, p0, Lcom/google/gson/g;->l:Z

    .line 43
    iget-object v0, p1, Lcom/google/gson/f;->s:Lcom/google/gson/w;

    iput-object v0, p0, Lcom/google/gson/g;->b:Lcom/google/gson/w;

    .line 44
    iget-object v0, p1, Lcom/google/gson/f;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/gson/g;->h:Ljava/lang/String;

    .line 45
    iget v0, p1, Lcom/google/gson/f;->q:I

    iput v0, p0, Lcom/google/gson/g;->i:I

    .line 46
    iget v0, p1, Lcom/google/gson/f;->r:I

    iput v0, p0, Lcom/google/gson/g;->j:I

    .line 47
    iget-object v0, p1, Lcom/google/gson/f;->t:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    iget-object p1, p1, Lcom/google/gson/f;->u:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private c(Ljava/lang/String;IILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/google/gson/y;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/sql/Date;

    .line 2
    .line 3
    const-class v1, Ljava/sql/Timestamp;

    .line 4
    .line 5
    const-class v2, Ljava/util/Date;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    new-instance p2, Lcom/google/gson/a;

    .line 22
    .line 23
    invoke-direct {p2, v2, p1}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p3, Lcom/google/gson/a;

    .line 27
    .line 28
    invoke-direct {p3, v1, p1}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/google/gson/a;

    .line 32
    .line 33
    invoke-direct {v3, v0, p1}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x2

    .line 38
    if-eq p2, p1, :cond_1

    .line 39
    .line 40
    if-eq p3, p1, :cond_1

    .line 41
    .line 42
    new-instance p1, Lcom/google/gson/a;

    .line 43
    .line 44
    invoke-direct {p1, v2, p2, p3}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;II)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lcom/google/gson/a;

    .line 48
    .line 49
    invoke-direct {v3, v1, p2, p3}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;II)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Lcom/google/gson/a;

    .line 53
    .line 54
    invoke-direct {v4, v0, p2, p3}, Lcom/google/gson/a;-><init>(Ljava/lang/Class;II)V

    .line 55
    .line 56
    .line 57
    move-object p2, p1

    .line 58
    move-object p3, v3

    .line 59
    move-object v3, v4

    .line 60
    :goto_0
    invoke-static {v2, p2}, Lcom/google/gson/internal/bind/n;->b(Ljava/lang/Class;Lcom/google/gson/x;)Lcom/google/gson/y;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    invoke-static {v1, p3}, Lcom/google/gson/internal/bind/n;->b(Ljava/lang/Class;Lcom/google/gson/x;)Lcom/google/gson/y;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v3}, Lcom/google/gson/internal/bind/n;->b(Ljava/lang/Class;Lcom/google/gson/x;)Lcom/google/gson/y;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method


# virtual methods
.method public a(Lcom/google/gson/b;)Lcom/google/gson/g;
    .locals 3

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/d;->o(Lcom/google/gson/b;ZZ)Lcom/google/gson/internal/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method

.method public b(Lcom/google/gson/b;)Lcom/google/gson/g;
    .locals 3

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/d;->o(Lcom/google/gson/b;ZZ)Lcom/google/gson/internal/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method

.method public d()Lcom/google/gson/f;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    move-object/from16 v18, v1

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, v0, Lcom/google/gson/g;->f:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    add-int/2addr v2, v3

    .line 20
    add-int/lit8 v2, v2, 0x3

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object v3, v0, Lcom/google/gson/g;->f:Ljava/util/List;

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Lcom/google/gson/g;->h:Ljava/lang/String;

    .line 47
    .line 48
    iget v3, v0, Lcom/google/gson/g;->i:I

    .line 49
    .line 50
    iget v4, v0, Lcom/google/gson/g;->j:I

    .line 51
    .line 52
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/google/gson/g;->c(Ljava/lang/String;IILjava/util/List;)V

    .line 53
    .line 54
    .line 55
    new-instance v19, Lcom/google/gson/f;

    .line 56
    .line 57
    move-object/from16 v1, v19

    .line 58
    .line 59
    iget-object v2, v0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 60
    .line 61
    iget-object v3, v0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    .line 62
    .line 63
    iget-object v4, v0, Lcom/google/gson/g;->d:Ljava/util/Map;

    .line 64
    .line 65
    iget-boolean v5, v0, Lcom/google/gson/g;->g:Z

    .line 66
    .line 67
    iget-boolean v6, v0, Lcom/google/gson/g;->k:Z

    .line 68
    .line 69
    iget-boolean v7, v0, Lcom/google/gson/g;->o:Z

    .line 70
    .line 71
    iget-boolean v8, v0, Lcom/google/gson/g;->m:Z

    .line 72
    .line 73
    iget-boolean v9, v0, Lcom/google/gson/g;->n:Z

    .line 74
    .line 75
    iget-boolean v10, v0, Lcom/google/gson/g;->p:Z

    .line 76
    .line 77
    iget-boolean v11, v0, Lcom/google/gson/g;->l:Z

    .line 78
    .line 79
    iget-object v12, v0, Lcom/google/gson/g;->b:Lcom/google/gson/w;

    .line 80
    .line 81
    iget-object v13, v0, Lcom/google/gson/g;->h:Ljava/lang/String;

    .line 82
    .line 83
    iget v14, v0, Lcom/google/gson/g;->i:I

    .line 84
    .line 85
    iget v15, v0, Lcom/google/gson/g;->j:I

    .line 86
    .line 87
    move-object/from16 v20, v1

    .line 88
    .line 89
    iget-object v1, v0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 90
    .line 91
    move-object/from16 v16, v1

    .line 92
    .line 93
    iget-object v1, v0, Lcom/google/gson/g;->f:Ljava/util/List;

    .line 94
    .line 95
    move-object/from16 v17, v1

    .line 96
    .line 97
    move-object/from16 v1, v20

    .line 98
    .line 99
    invoke-direct/range {v1 .. v18}, Lcom/google/gson/f;-><init>(Lcom/google/gson/internal/d;Lcom/google/gson/e;Ljava/util/Map;ZZZZZZZLcom/google/gson/w;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    return-object v19
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
.end method

.method public e()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/gson/g;->m:Z

    return-object p0
.end method

.method public f()Lcom/google/gson/g;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    invoke-virtual {v0}, Lcom/google/gson/internal/d;->c()Lcom/google/gson/internal/d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method

.method public g()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->k:Z

    return-object p0
.end method

.method public varargs h([I)Lcom/google/gson/g;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/d;->p([I)Lcom/google/gson/internal/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method

.method public i()Lcom/google/gson/g;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    invoke-virtual {v0}, Lcom/google/gson/internal/d;->h()Lcom/google/gson/internal/d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method

.method public j()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->o:Z

    return-object p0
.end method

.method public k(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/g;
    .locals 3

    .line 1
    instance-of v0, p2, Lcom/google/gson/t;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v1, p2, Lcom/google/gson/k;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    instance-of v1, p2, Lcom/google/gson/h;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    instance-of v1, p2, Lcom/google/gson/x;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 21
    :goto_1
    invoke-static {v1}, Lcom/google/gson/internal/a;->a(Z)V

    .line 22
    .line 23
    .line 24
    instance-of v1, p2, Lcom/google/gson/h;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/gson/g;->d:Ljava/util/Map;

    .line 29
    .line 30
    move-object v2, p2

    .line 31
    check-cast v2, Lcom/google/gson/h;

    .line 32
    .line 33
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_2
    if-nez v0, :cond_3

    .line 37
    .line 38
    instance-of v0, p2, Lcom/google/gson/k;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    :cond_3
    invoke-static {p1}, Lcom/google/gson/reflect/a;->c(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/l;->l(Lcom/google/gson/reflect/a;Ljava/lang/Object;)Lcom/google/gson/y;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_4
    instance-of v0, p2, Lcom/google/gson/x;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object v0, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/google/gson/reflect/a;->c(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p2, Lcom/google/gson/x;

    .line 66
    .line 67
    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/n;->a(Lcom/google/gson/reflect/a;Lcom/google/gson/x;)Lcom/google/gson/y;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_5
    return-object p0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public l(Lcom/google/gson/y;)Lcom/google/gson/g;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public m(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/gson/g;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/google/gson/t;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v1, p2, Lcom/google/gson/k;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    instance-of v1, p2, Lcom/google/gson/x;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 17
    :goto_1
    invoke-static {v1}, Lcom/google/gson/internal/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    instance-of v1, p2, Lcom/google/gson/k;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, Lcom/google/gson/g;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/l;->m(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/y;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_3
    instance-of v0, p2, Lcom/google/gson/x;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 40
    .line 41
    check-cast p2, Lcom/google/gson/x;

    .line 42
    .line 43
    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/n;->e(Ljava/lang/Class;Lcom/google/gson/x;)Lcom/google/gson/y;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_4
    return-object p0
.end method

.method public n()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->g:Z

    return-object p0
.end method

.method public o()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->l:Z

    return-object p0
.end method

.method public p(I)Lcom/google/gson/g;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/gson/g;->i:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/google/gson/g;->h:Ljava/lang/String;

    .line 5
    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public q(II)Lcom/google/gson/g;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/gson/g;->i:I

    .line 2
    .line 3
    iput p2, p0, Lcom/google/gson/g;->j:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/google/gson/g;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public r(Ljava/lang/String;)Lcom/google/gson/g;
    .locals 0

    iput-object p1, p0, Lcom/google/gson/g;->h:Ljava/lang/String;

    return-object p0
.end method

.method public varargs s([Lcom/google/gson/b;)Lcom/google/gson/g;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-virtual {v3, v2, v4, v4}, Lcom/google/gson/internal/d;->o(Lcom/google/gson/b;ZZ)Lcom/google/gson/internal/d;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public t(Lcom/google/gson/d;)Lcom/google/gson/g;
    .locals 0

    iput-object p1, p0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    return-object p0
.end method

.method public u(Lcom/google/gson/e;)Lcom/google/gson/g;
    .locals 0

    iput-object p1, p0, Lcom/google/gson/g;->c:Lcom/google/gson/e;

    return-object p0
.end method

.method public v()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->p:Z

    return-object p0
.end method

.method public w(Lcom/google/gson/w;)Lcom/google/gson/g;
    .locals 0

    iput-object p1, p0, Lcom/google/gson/g;->b:Lcom/google/gson/w;

    return-object p0
.end method

.method public x()Lcom/google/gson/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/g;->n:Z

    return-object p0
.end method

.method public y(D)Lcom/google/gson/g;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/d;->q(D)Lcom/google/gson/internal/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/g;->a:Lcom/google/gson/internal/d;

    return-object p0
.end method
