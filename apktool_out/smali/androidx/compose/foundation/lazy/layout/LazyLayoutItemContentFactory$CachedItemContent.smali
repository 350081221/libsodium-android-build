.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CachedItemContent"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R#\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0006\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;",
        "",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "createContentLambda",
        "()Lv3/p;",
        "key",
        "Ljava/lang/Object;",
        "getKey",
        "()Ljava/lang/Object;",
        "contentType",
        "getContentType",
        "",
        "<set-?>",
        "index",
        "I",
        "getIndex",
        "()I",
        "_content",
        "Lv3/p;",
        "getContent",
        "content",
        "<init>",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"
    }
.end annotation


# instance fields
.field private _content:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final contentType:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private index:I

.field private final key:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p2    # I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->this$0:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->key:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->contentType:Ljava/lang/Object;

    .line 9
    .line 10
    iput p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->index:I

    .line 11
    .line 12
    return-void
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
.end method

.method public static final synthetic access$setIndex$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->index:I

    return-void
.end method

.method public static final synthetic access$set_content$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;Lv3/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->_content:Lv3/p;

    return-void
.end method

.method private final createContentLambda()Lv3/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->this$0:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    invoke-direct {v0, v1, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;)V

    const v1, 0x53af4291

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getContent()Lv3/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->_content:Lv3/p;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->createContentLambda()Lv3/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->_content:Lv3/p;

    :cond_0
    return-object v0
.end method

.method public final getContentType()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->contentType:Ljava/lang/Object;

    return-object v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->index:I

    return v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;->key:Ljava/lang/Object;

    return-object v0
.end method
