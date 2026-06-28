.class public final Lcom/google/gson/internal/bind/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/y;


# instance fields
.field private final a:Lcom/google/gson/internal/c;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/d;->a:Lcom/google/gson/internal/c;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public a(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/f;",
            "Lcom/google/gson/reflect/a<",
            "TT;>;)",
            "Lcom/google/gson/x<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->f()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lq1/b;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lq1/b;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/bind/d;->a:Lcom/google/gson/internal/c;

    .line 18
    .line 19
    invoke-virtual {p0, v1, p1, p2, v0}, Lcom/google/gson/internal/bind/d;->b(Lcom/google/gson/internal/c;Lcom/google/gson/f;Lcom/google/gson/reflect/a;Lq1/b;)Lcom/google/gson/x;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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

.method b(Lcom/google/gson/internal/c;Lcom/google/gson/f;Lcom/google/gson/reflect/a;Lq1/b;)Lcom/google/gson/x;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/internal/c;",
            "Lcom/google/gson/f;",
            "Lcom/google/gson/reflect/a<",
            "*>;",
            "Lq1/b;",
            ")",
            "Lcom/google/gson/x<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-interface {p4}, Lq1/b;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/gson/reflect/a;->b(Ljava/lang/Class;)Lcom/google/gson/reflect/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lcom/google/gson/internal/c;->a(Lcom/google/gson/reflect/a;)Lcom/google/gson/internal/k;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lcom/google/gson/internal/k;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    instance-of v0, p1, Lcom/google/gson/x;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast p1, Lcom/google/gson/x;

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    instance-of v0, p1, Lcom/google/gson/y;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p1, Lcom/google/gson/y;

    .line 29
    .line 30
    invoke-interface {p1, p2, p3}, Lcom/google/gson/y;->a(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    instance-of v0, p1, Lcom/google/gson/t;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    instance-of v1, p1, Lcom/google/gson/k;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    new-instance p4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v0, "Invalid attempt to bind an instance of "

    .line 52
    .line 53
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p1, " as a @JsonAdapter for "

    .line 68
    .line 69
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3}, Lcom/google/gson/reflect/a;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 80
    .line 81
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p2

    .line 92
    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    move-object v0, p1

    .line 96
    check-cast v0, Lcom/google/gson/t;

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    move-object v3, v1

    .line 101
    :goto_1
    instance-of v0, p1, Lcom/google/gson/k;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    move-object v1, p1

    .line 106
    check-cast v1, Lcom/google/gson/k;

    .line 107
    .line 108
    :cond_5
    move-object v4, v1

    .line 109
    new-instance p1, Lcom/google/gson/internal/bind/l;

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    move-object v2, p1

    .line 113
    move-object v5, p2

    .line 114
    move-object v6, p3

    .line 115
    invoke-direct/range {v2 .. v7}, Lcom/google/gson/internal/bind/l;-><init>(Lcom/google/gson/t;Lcom/google/gson/k;Lcom/google/gson/f;Lcom/google/gson/reflect/a;Lcom/google/gson/y;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    if-eqz p1, :cond_6

    .line 119
    .line 120
    invoke-interface {p4}, Lq1/b;->nullSafe()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/google/gson/x;->d()Lcom/google/gson/x;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :cond_6
    return-object p1
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
