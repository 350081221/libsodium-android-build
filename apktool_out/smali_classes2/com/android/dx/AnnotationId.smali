.class public final Lcom/android/dx/AnnotationId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/AnnotationId$Element;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final annotatedElement:Ljava/lang/annotation/ElementType;

.field private final declaringType:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "TD;>;"
        }
    .end annotation
.end field

.field private final elements:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/android/dx/rop/annotation/NameValuePair;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/annotation/ElementType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/TypeId<",
            "TD;>;",
            "Lcom/android/dx/TypeId<",
            "TV;>;",
            "Ljava/lang/annotation/ElementType;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/AnnotationId;->declaringType:Lcom/android/dx/TypeId;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/AnnotationId;->type:Lcom/android/dx/TypeId;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/AnnotationId;->annotatedElement:Ljava/lang/annotation/ElementType;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/android/dx/AnnotationId;->elements:Ljava/util/HashMap;

    .line 16
    .line 17
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
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
.end method

.method public static get(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/annotation/ElementType;)Lcom/android/dx/AnnotationId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/TypeId<",
            "TD;>;",
            "Lcom/android/dx/TypeId<",
            "TV;>;",
            "Ljava/lang/annotation/ElementType;",
            ")",
            "Lcom/android/dx/AnnotationId<",
            "TD;TV;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;

    .line 2
    .line 3
    if-eq p2, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;

    .line 6
    .line 7
    if-eq p2, v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;

    .line 10
    .line 11
    if-eq p2, v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;

    .line 14
    .line 15
    if-ne p2, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p1, "element type is not supported to annotate yet."

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    new-instance v0, Lcom/android/dx/AnnotationId;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/AnnotationId;-><init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/annotation/ElementType;)V

    .line 29
    .line 30
    .line 31
    return-object v0
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
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
.end method


# virtual methods
.method public addToMethod(Lcom/android/dx/DexMaker;Lcom/android/dx/MethodId;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/DexMaker;",
            "Lcom/android/dx/MethodId<",
            "**>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/AnnotationId;->annotatedElement:Ljava/lang/annotation/ElementType;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p2, Lcom/android/dx/MethodId;->declaringType:Lcom/android/dx/TypeId;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/AnnotationId;->declaringType:Lcom/android/dx/TypeId;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/dx/AnnotationId;->declaringType:Lcom/android/dx/TypeId;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/android/dx/DexMaker;->getTypeDeclaration(Lcom/android/dx/TypeId;)Lcom/android/dx/DexMaker$TypeDeclaration;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/android/dx/DexMaker$TypeDeclaration;->toClassDefItem()Lcom/android/dx/dex/file/ClassDefItem;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object p2, p2, Lcom/android/dx/MethodId;->constant:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/dx/AnnotationId;->type:Lcom/android/dx/TypeId;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lcom/android/dx/rop/annotation/Annotation;

    .line 42
    .line 43
    sget-object v3, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 44
    .line 45
    invoke-direct {v2, v1, v3}, Lcom/android/dx/rop/annotation/Annotation;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/annotation/AnnotationVisibility;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lcom/android/dx/rop/annotation/Annotations;

    .line 49
    .line 50
    invoke-direct {v1}, Lcom/android/dx/rop/annotation/Annotations;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lcom/android/dx/AnnotationId;->elements:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Lcom/android/dx/rop/annotation/Annotation;->add(Lcom/android/dx/rop/annotation/NameValuePair;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/annotation/Annotations;->add(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/android/dx/DexMaker;->getDexFile()Lcom/android/dx/dex/file/DexFile;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v0, p2, v1, p1}, Lcom/android/dx/dex/file/ClassDefItem;->addMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 91
    .line 92
    const-string p2, "Method reference is NULL"

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 99
    .line 100
    const-string p2, "No class defined item is found"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v1, "Method"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p2, "\'s declaring type is inconsistent with"

    .line 122
    .line 123
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    const-string p2, "This annotation is not for method"

    .line 140
    .line 141
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1
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

.method public set(Lcom/android/dx/AnnotationId$Element;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/AnnotationId$Element;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/AnnotationId$Element;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lcom/android/dx/AnnotationId$Element;->toConstant(Ljava/lang/Object;)Lcom/android/dx/rop/cst/Constant;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Lcom/android/dx/rop/annotation/NameValuePair;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/Constant;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/android/dx/AnnotationId;->elements:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/AnnotationId$Element;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 36
    .line 37
    const-string v0, "element == null"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
