.class public interface abstract annotation Landroidx/room/TypeConverters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Landroidx/room/TypeConverters;
        builtInTypeConverters = .subannotation Landroidx/room/BuiltInTypeConverters;
        .end subannotation
        value = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0002\u0018\u00002\u00020\u0001B(\u0012\u001c\u0008\u0002\u0010\u0004\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00030\u0002\"\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/room/TypeConverters;",
        "",
        "",
        "Lkotlin/reflect/d;",
        "value",
        "()[Ljava/lang/Class;",
        "Landroidx/room/BuiltInTypeConverters;",
        "builtInTypeConverters",
        "()Landroidx/room/BuiltInTypeConverters;",
        "room-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->BINARY:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->FUNCTION:Ln3/b;,
        .enum Ln3/b;->VALUE_PARAMETER:Ln3/b;,
        .enum Ln3/b;->FIELD:Ln3/b;,
        .enum Ln3/b;->CLASS:Ln3/b;
    }
.end annotation


# virtual methods
.method public abstract builtInTypeConverters()Landroidx/room/BuiltInTypeConverters;
.end method

.method public abstract value()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
